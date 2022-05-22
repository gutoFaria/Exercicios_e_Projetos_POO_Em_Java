class exer14 
{
    public static void main(String[] args)
    {
        int[] x = {1,2,3};
        int[] y = {4,5,6};
        int[] z = new int[3];
        int soma = 0;

        System.out.println("Vetor X");
        for (int i = 0; i < y.length; i++) 
        {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
        System.out.println("Vetor Y");
        for (int i = 0; i < y.length; i++) 
        {
            System.out.print(y[i] + " ");
        }

        System.out.println("Produto escalar dos vetores");
        for (int i = 0; i < y.length; i++) 
        {
            z[i] = x[i] * y[i];
            soma += z[i];
        }

        System.out.println("");
        System.out.println("Produto escalar dos vetores igual a: " + soma);
    }    
}
