/* Cliente:
Crie uma classe Cliente, que possui nome, idade, sexo, email e senha. Crie um construtor e os métodos de acesso dos atributos.
Na classe cliente, crie um método chamado imprimeInformacoes, que imprime as informações do cliente de forma legível e organizada.
*/

public class Cliente {
    private String nome, email, senha, sexo;
    private int idade;
    
    public Cliente(String nome, int idade, String sexo, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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

    public void imprimeInformacoes() {
        System.out.println("_____________________________\n");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\nEmail: " + email);
        System.out.println("_____________________________\n");
    }
}