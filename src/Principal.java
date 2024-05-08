/*Principal:
    Crie uma classe chamada Principal. Nela, coloque o método main.
    No main, crie 3 instâncias de Livro e 3 instâncias de Cliente. Todas as informações necessárias para a criação dos objetos devem ser solicitadas pelo Teclado.
    Imprima o preço por página de cada um dos livros criados.
    Imprima as informações de todos os objetos criados. */

public class Principal {
    public static void main(String[] args) throws Exception {
        Livro livro1 = new Livro("Livro 1", 1980, 20.5, 130);
        Livro livro2 = new Livro("Livro 2", 2020, 30.5, 170);
        Livro livro3 = new Livro("Livro 3", 2015, 50.5, 230);
        
        Cliente cliente1 = new Cliente("Cliente 1", 19, "F", "cliente1@email.com", "123");
        Cliente cliente2 = new Cliente("Cliente 2", 56, "M", "cliente2@email.com", "123");
        Cliente cliente3 = new Cliente("Cliente 3", 34, "F", "cliente3@email.com", "123");
        
        livro1.imprimeLivro();
        System.out.println("Preço por página: " + livro1.calcularPrecoPorPagina() + "\n");
        livro2.imprimeLivro();
        System.out.println("Preço por página: " + livro2.calcularPrecoPorPagina() + "\n");
        livro3.imprimeLivro();
        System.out.println("Preço por página: " + livro3.calcularPrecoPorPagina() + "\n");

        cliente1.imprimeInformacoes();
        cliente2.imprimeInformacoes();
        cliente3.imprimeInformacoes();
    }
}
