import java.util.Scanner;

class exer15 
{
    public static void main(String[] args)
    {
        int[] vetor = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 10 numeros");
        for (int i = 0; i < vetor.length; i++) 
        {
            System.out.println("Digite o "+ (i+1)+" numero:");
            vetor[i] = scan.nextInt();
        }

        System.out.println("Digite um valor");
        int X = scan.nextInt();

        int menor=0,igual=0,maior=0;

        for (int i = 0; i < vetor.length; i++) 
        {
            if(X < vetor[i])
                menor +=1;
            else if(X ==vetor[i])
                igual+=1;
            else if(X > vetor[i])
                maior +=1;
            
        }

        System.out.println("Quantidade de numeros menores a "+ X + " e: "+menor);
        System.out.println("Quantidade de numeros iguais a "+ X + " e: "+igual);
        System.out.println("Quantidade de numeros maiores a "+ X + " e: "+maior);

        scan.close();
    }
}
