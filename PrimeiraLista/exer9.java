import java.util.Scanner;

class exer9 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double h;
        int opcao =0;

        System.out.print("Digite a altura:");
        h = scan.nextDouble();

        System.out.print("Digite:\n[1] para homem\n[2] para mulher\nQual opcao:");
        opcao = scan.nextInt();

        if(opcao == 1)
        {
            System.out.println("Peso ideal para o homem de altura = "+h+" e: "+((72.7*h)-58));
        }
        else
        {
            System.out.println("Peso ideal para a mulher de altura = "+h+" e: "+((62.1*h)-44.7));
        }
        scan.close();
    }
}
