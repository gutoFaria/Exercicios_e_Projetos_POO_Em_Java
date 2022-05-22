class exer3 
{
    public static void main(String[] args)
    {
        long IdVendendor, CodigoPeca;
        int  QuantidadeVendidade;
        double PrecoPeca;

        IdVendendor = 0001;
        CodigoPeca = 2321;
        QuantidadeVendidade = 22;
        PrecoPeca = 2.50;

        System.out.println("Vendendor: " + IdVendendor);
        System.out.println("Peça Vendida: " + CodigoPeca);
        System.out.println("Quantidade Vendida: " + QuantidadeVendidade);
        System.out.println("Preço Unitário: " + PrecoPeca);
        System.out.println("Valor Total: " + (QuantidadeVendidade*PrecoPeca));
        System.out.println("Comição para Vendendor: " + (QuantidadeVendidade*PrecoPeca*0.05));

    }
}
