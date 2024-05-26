/* Livro:
    Crie uma classe Livro, que possui título, autor, ano de publicação, preço e quantidade de páginas.
    Crie um construtor para esta classe e os métodos de acesso de todos os atributos.
    Na classe Livro, crie um método chamado calcularPrecoPorPagina, que retorna o valor de cada página do livro, levando em conta seu preço.
    Crie nesta classe, também, um método que imprime as informações de forma clara e organizada. 
    Crie nesta classe, também, o método toString.*/

public class Livro{
    private String titulo, autor;
    private int anoPublicacao, qtdPaginas;
    private double preco;

    //Construtor:
    public Livro (String titulo, String autor, int anoPublicacao, double preco, int qtdPaginas) {
        this.titulo = titulo;
        this.autor = autor;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        System.out.println("\tTitulo: " + titulo + "\n\tAno de Publicação: " + anoPublicacao + "\n\tPreço: " + preco + "\n\tQuantidade de páginas: " + qtdPaginas);
        System.out.println("________________________________________");
    }

    //toString method:
    @Override
    public String toString() {
        return String.format(
            "Livro [Título = %s, Autor = %s, Publicação = %d, Preco = R$%.2f, Páginas = %d, Preço por Página = R$%.2f]",
            this.titulo, this.autor, this.anoPublicacao, this.preco, this.qtdPaginas, this.calcularPrecoPorPagina());
    }
}