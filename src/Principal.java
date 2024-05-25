/*Principal:
   Crie uma classe chamada Principal. Nela, coloque o método main.
    No main, crie 3 instâncias de Livro e 3 instâncias de Cliente.
    Imprima o preço por página de cada um dos livros dos clientes, no formato: "O cliente X está com o livro Y, e o preço por página deste livro é R$Z", 
    substituindo X pelo nome do cliente, Y pelo título do livro e Z pelo preço por página deste livro.
    Imprima as informações de todos os clientes criados.*/

public class Principal {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Livro 1", 1980, 20.5, 130);
        Livro livro2 = new Livro("Livro 2", 2020, 30.5, 170);
        Livro livro3 = new Livro("Livro 3", 2015, 50.5, 230);
        
        Cliente cliente1 = new Cliente("Cliente 1", 19, "F", "cliente1@email.com", "123", livro1);
        Cliente cliente2 = new Cliente("Cliente 2", 56, "M", "cliente2@email.com", "123", livro2);
        Cliente cliente3 = new Cliente("Cliente 3", 34, "F", "cliente3@email.com", "123", livro3);
        
        System.out.println("O cliente " + cliente1.getNome() + " está com o livro " + cliente1.livro.getTitulo() + 
                            ", e o preço por página deste livro é R$" + cliente1.livro.calcularPrecoPorPagina());
        System.out.println("\nO cliente " + cliente2.getNome() + " está com o livro " + cliente2.livro.getTitulo() + 
                            ", e o preço por página deste livro é R$" + cliente2.livro.calcularPrecoPorPagina());
        System.out.println("\nO cliente " + cliente3.getNome() + " está com o livro " + cliente3.livro.getTitulo() + 
                            ", e o preço por página deste livro é R$" + cliente3.livro.calcularPrecoPorPagina());
        
        cliente1.imprimeInformacoes();
        cliente2.imprimeInformacoes();
        cliente3.imprimeInformacoes();
    }
}
