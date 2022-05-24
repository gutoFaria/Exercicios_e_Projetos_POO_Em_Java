import java.util.Scanner;

class exer18 
{
    public static String VERIFICA(int x)
    {
        if(x % 2 == 0)
            return "PAR";
        else
            return "IMPAR";
    }
    
    public static void main(String[] args)
    {
        System.out.println("Verifica PAR ou IMPAR");

        int x;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        x = scan.nextInt();

        System.out.println("O valor digitado e: " + VERIFICA(x));

        scan.close();
    }
}
