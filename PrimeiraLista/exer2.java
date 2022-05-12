import java.util.Scanner;

class exer2
{
    public static void main(String[] args)
    {
        float cotacao,valordolar;
        Scanner scan = new Scanner(System.in);
        System.out.println("------COTAÇÂO DO DOLAR------");

        System.out.print("Digite a cotação do dolar atual em reais:");
        cotacao = scan.nextFloat();

        System.out.print("Digite uma quantidade de valor em dolar:");
        valordolar = scan.nextFloat();

        System.out.println(valordolar + " dolares e igual a: R$ " + (valordolar*cotacao));

        scan.close();

    }
}