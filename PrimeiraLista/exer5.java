import java.util.Scanner;

class exer5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a;

        System.out.print("Digite um valor para x:");
        a = scan.nextDouble();

        System.out.println("Exibindo o modulo");

        if(a >= 0)
            System.out.println("x = " + a);
        else if(a < 0)
        System.out.println("x = " + a *(-1));

        scan.close();
    }
}
