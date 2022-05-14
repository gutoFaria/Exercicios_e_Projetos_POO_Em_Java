import java.util.Scanner;

class exer7 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double x,y;
        int opcao;

        System.out.print("Digite um valor:");
        x = scan.nextDouble();

        System.out.print("Digite um segundo valor:");
        y = scan.nextDouble();

        System.out.println("1-Adicao");
        System.out.println("2-Subtracao");
        System.out.println("3-Multiplicacao");
        System.out.println("4-Divisao");
        System.out.print("Escolha uma opção:");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(x + " + "+ y +" = "+ (x+y) );
                break;
            case 2:
                System.out.println(x + " - "+ y +" = "+ (x-y) );
                break;
            case 3:
                System.out.println(x + " * "+ y +" = "+ (x*y) );
                break;
            case 4:
                System.out.println(x + " / "+ y +" = "+ (x/y) );
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        scan.close();
    }    
}
