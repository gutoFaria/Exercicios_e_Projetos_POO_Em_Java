import java.util.Scanner;

class exer16
{
    public static double REAJUSTE(double salario,double re)
    {
        return salario + re;
    }
    public static void main(String[] args)
    {
        System.out.println("Calculo do reajuste de salario");

        double salario,re;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salario atual: ");
        salario = scan.nextDouble();

        System.out.println("Digite o valor do reajuste");
        re = scan.nextDouble();

        System.out.println("Salario com reajuste: " + REAJUSTE(salario,re));

        scan.close();

    }
}