import java.util.Scanner;

class exer1
{
    public static void main(String[] args)
    {
        float minimo,maximo,media;
        Scanner scan = new Scanner(System.in);
        System.out.println("ESTOQUE MEDIO DE UMA PECA");

        System.out.print("Entre com o valor minimo:");
        minimo = scan.nextFloat();

        System.out.print("Entre com o valor maximo:");
        maximo = scan.nextFloat();

        media = (minimo+maximo)/2;

        System.out.println("Valor medio das pecas e: " + media);

        scan.close();

    }
}