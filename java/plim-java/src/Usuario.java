public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;
    private Double saldoDisponivel;

    // Construtor padrão
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(String nome, String email, String senha, String cpf, String telefone, Double saldoDisponivel) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.saldoDisponivel = saldoDisponivel;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Double getSaldoDisponivel() { return saldoDisponivel; }
    public void setSaldoDisponivel(Double saldoDisponivel) { this.saldoDisponivel = saldoDisponivel; }

    // Métodos
    public void cadastrar() {
        System.out.println("Executando cadastrar(): registrando novo usuário no sistema Plim - " + nome);
    }

    public void atualizarPerfil() {
        System.out.println("Executando atualizarPerfil(): atualizando dados do usuário - " + nome);
    }

    public void visualizarSaldo() {
        System.out.println("Executando visualizarSaldo(): exibindo saldo disponível do usuário - R$ " + saldoDisponivel);
    }

    public void excluirConta() {
        System.out.println("Executando excluirConta(): removendo conta do usuário - " + email);
    }
}
