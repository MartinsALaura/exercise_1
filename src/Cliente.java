/* Cliente:
Crie uma classe Cliente, que possui nome, idade, sexo, email, senha e um livro. Crie um construtor e os métodos de acesso dos atributos.
Na classe cliente, crie um método chamado imprimeInformacoes, que imprime as informações do cliente de forma legível e organizada.
Crie nesta classe, também, o método toString.
*/

public class Cliente {
    private String nome, email, senha;
    private char sexo;
    private int idade;
    public Livro livro;

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", senha=" + senha + ", sexo=" + sexo + ", idade=" + idade
                + ", livro=" + livro.toString() + "]";
    }

    public Cliente(String nome, int idade, char sexo, String email, String senha, Livro livro) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void imprimeInformacoes() {
        System.out.println("________________________________________\n");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nEmail: " + email + "\nLivro: ");
        livro.imprimeLivro();
    }
}