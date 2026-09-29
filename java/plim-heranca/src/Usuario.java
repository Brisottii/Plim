// Classe independente que representa o usuário do Plim
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

    // Getters e Setters (Encapsulamento)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            System.out.println("Senha inválida. Mínimo de 6 caracteres.");
        }
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Double getSaldoDisponivel() { return saldoDisponivel; }
    public void setSaldoDisponivel(Double saldoDisponivel) { this.saldoDisponivel = saldoDisponivel; }

    // Métodos com lógica real
    public boolean autenticar(String emailDigitado, String senhaDigitada) {
        return this.email.equals(emailDigitado) && this.senha.equals(senhaDigitada);
    }

    public void atualizarSaldo(Double valor) {
        this.saldoDisponivel += valor;
    }

    public String gerarResumo() {
        return "Usuário: " + nome + " | Email: " + email + " | Saldo: R$ " + String.format("%.2f", saldoDisponivel);
    }

    public boolean possuiSaldoSuficiente(Double valor) {
        return this.saldoDisponivel >= valor;
    }

    public void exibirPerfil() {
        System.out.println("========= Perfil do Usuário =========");
        System.out.println("Nome:   " + nome);
        System.out.println("Email:  " + email);
        System.out.println("CPF:    " + cpf);
        System.out.println("Tel:    " + telefone);
        System.out.println("Saldo:  R$ " + String.format("%.2f", saldoDisponivel));
        System.out.println("=====================================");
    }
}
