import java.util.Scanner;

class exer12 
{
    public static void main(String[] args)
    {
        int numero;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero para mostrar a tabuada:");
        numero = scan.nextInt();

        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(numero + " x " + i + " = " + (i*numero));
        }

        scan.close();
    }    
}
