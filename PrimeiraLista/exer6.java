import java.util.Scanner;

class exer6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double a,b,c;

        System.out.print("Digite um valor para A:");
        a = scan.nextDouble();

        System.out.print("Digite um valor para B:");
        b = scan.nextDouble();

        System.out.print("Digite um valor para C:");
        c = scan.nextDouble();

        System.out.println("Ordem decrescente:");
        if(a < b && b < c)
        {
            System.out.println(c + " - " + b + " - "+ a);
        }
        else if(a < c && c < b)
        {
            System.out.println(a + " - " + c + " - "+ b);
        }
        else if(b < a && a < c)
        {
            System.out.println(c + " - " + a + " - "+ b);
        }
        else if(b < c && c < a)
        {
            System.out.println(a + " - " + c + " - "+ b);
        }
        else if(c < a && a < b)
        {
            System.out.println(b + " - " + a + " - "+ c);
        }
        else if(c < b && b < a)
        {
            System.out.println(a + " - " + b + " - "+ c);
        }

        scan.close();
    }
}
