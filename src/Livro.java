/* Livro:
    Crie uma classe Livro, que possui título, autor, ano de publicação, preço e quantidade de páginas.
    Crie um construtor para esta classe e os métodos de acesso de todos os atributos.
    Na classe Livro, crie um método chamado calcularPrecoPorPagina, que retorna o valor de cada página do livro, levando em conta seu preço.
    Crie nesta classe, também, um método que imprime as informações de forma clara e organizada. */

public class Livro{
    private String titulo;
    private int anoPublicacao, qtdPaginas;
    private double preco;
    
    //Construtor:
    public Livro (String titulo, int anoPublicacao, double preco, int qtdPaginas) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;
    }
    
    //get e set:
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco ){
        this.preco = preco;
    }

    public int getQtdPaginas(){
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas){
        this.qtdPaginas = qtdPaginas;
    }

    public String calcularPrecoPorPagina(){
        return  String.format("%.2f", preco/qtdPaginas);
    }

    public void imprimeLivro(){
        System.out.println("_____________________________\n");
        System.out.println("Titulo: " + titulo + "\nAno de Publicação: " + anoPublicacao + "\nPreço: " + preco + "\nQuantidade de páginas: " + qtdPaginas);
        System.out.println("_____________________________");
    }
}