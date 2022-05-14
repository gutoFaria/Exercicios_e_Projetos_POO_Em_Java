import java.util.Scanner;

class exer4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a,b, aux;

        System.out.print("Digite um valor para A:");
        a = scan.nextDouble();

        System.out.print("Digite um valor para B:");
        b = scan.nextDouble();

        System.out.println("Troca de valores");
        aux = a;
        a = b;
        b = aux;

        System.out.println("A = " + a + " B = "+ b);

        scan.close();
    }
}