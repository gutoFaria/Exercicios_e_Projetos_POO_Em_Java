class exer13 
{
    public static void main(String[] args)
    {
        int [] n = {1,2,3,4,5,6};

        System.out.println("Vetor crescente: ");
        for (int i = 0; i < n.length; i++) 
        {
            System.out.print(n[i] + " ");
        }

        System.out.println("");
        System.out.println("Vetor decrescente: ");
        for (int i = 0; i < n.length; i++) 
        {
            System.out.print(n[n.length-(i+1)] + " ");
        }
    }
}
