import java.util.Scanner;

class exer8 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double x,y;
        int opcao =0;

        System.out.print("Digite um valor:");
        x = scan.nextDouble();

        System.out.print("Digite um segundo valor:");
        y = scan.nextDouble();

        while(opcao != 4)
        {
            System.out.println("1-Verificar se um dos numeros lidos e ou não multiplo do outro");
            System.out.println("2-Verificar se os dois numeros lidos sao pares");
            System.out.println("3-Verificar se a media dos numeros e maior ou igual a 7");
            System.out.println("4-Sair");
            System.out.print("Escolha uma opcao:");
            opcao = scan.nextInt();
            switch (opcao) 
            {
                case 1:
                    if(x%y ==0)
                        System.out.println(y+ " é multiplo de " + x);
                    else if(y % x == 0)
                        System.out.println(x+ " é multiplo de " + y);
                    else
                        System.out.println("Nao ha multiplo");
                    break;
                case 2:
                    if(x%2 ==0)
                        System.out.println(x+ " é par " );
                    else if(y % 2 == 0)
                        System.out.println(y+ " é par");
                    else
                        System.out.println("Nao ha numeros pares");
                    break;
                case 3:
                    if((x+y)/2 >= 7)
                        System.out.println("media: " + (x+y)/2);
                    else
                        System.out.println("media menor que 7: " + (x+y)/2);
                    break;
                case 4:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
        

        scan.close();
    }
}
