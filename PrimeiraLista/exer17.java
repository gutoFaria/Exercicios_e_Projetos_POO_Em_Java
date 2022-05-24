import java.util.Scanner;

class exer17 
{
    public static double HIPOTENUSA(double x, double y)
    {
        return Math.hypot(x, y);
    }
    public static void main(String[] args)
    {
        System.out.println("Calculo da hipotenusa ");

        double x,y;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        x = scan.nextDouble();

        System.out.print("Digite o valor da altura: ");
        y = scan.nextDouble();

        System.out.print("A hipotenusa e igual a: " + HIPOTENUSA(x, y));
        scan.close();
    }
}
