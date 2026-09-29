// Classe independente que representa o cartão do usuário no Plim
public class Cartao {

    private String numeroCartao;
    private String titular;
    private String validade;
    private Double limiteTotal;
    private Double limiteDisponivel;
    private Double faturaAtual;
    private Boolean ativo;

    // Construtor padrão
    public Cartao() {
    }

    // Construtor com parâmetros
    public Cartao(String numeroCartao, String titular, String validade, Double limiteTotal) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.validade = validade;
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteTotal;
        this.faturaAtual = 0.0;
        this.ativo = true;
    }

    // Getters e Setters (Encapsulamento)
    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public Double getLimiteTotal() { return limiteTotal; }
    public void setLimiteTotal(Double limiteTotal) { this.limiteTotal = limiteTotal; }

    public Double getLimiteDisponivel() { return limiteDisponivel; }
    public Double getFaturaAtual() { return faturaAtual; }
    public Boolean getAtivo() { return ativo; }

    // Métodos com lógica real
    public boolean realizarCompra(Double valor) {
        if (!ativo) {
            System.out.println("Cartão bloqueado. Compra não autorizada.");
            return false;
        }
        if (valor > limiteDisponivel) {
            System.out.println("Limite insuficiente. Compra de R$ " + String.format("%.2f", valor) + " negada.");
            return false;
        }
        limiteDisponivel -= valor;
        faturaAtual += valor;
        System.out.println("Compra de R$ " + String.format("%.2f", valor) + " aprovada! Limite restante: R$ " + String.format("%.2f", limiteDisponivel));
        return true;
    }

    public void pagarFatura(Double valorPago) {
        if (valorPago >= faturaAtual) {
            limiteDisponivel = limiteTotal;
            faturaAtual = 0.0;
            System.out.println("Fatura paga integralmente. Limite restaurado: R$ " + String.format("%.2f", limiteTotal));
        } else {
            faturaAtual -= valorPago;
            limiteDisponivel += valorPago;
            System.out.println("Pagamento parcial de R$ " + String.format("%.2f", valorPago) + ". Fatura restante: R$ " + String.format("%.2f", faturaAtual));
        }
    }

    public void bloquearCartao() {
        this.ativo = false;
        System.out.println("Cartão de " + titular + " bloqueado com sucesso.");
    }

    public void desbloquearCartao() {
        this.ativo = true;
        System.out.println("Cartão de " + titular + " desbloqueado com sucesso.");
    }

    public void exibirResumo() {
        System.out.println("========= Resumo do Cartão =========");
        System.out.println("Titular:   " + titular);
        System.out.println("Número:    " + numeroCartao);
        System.out.println("Validade:  " + validade);
        System.out.println("Limite:    R$ " + String.format("%.2f", limiteTotal));
        System.out.println("Disponível:R$ " + String.format("%.2f", limiteDisponivel));
        System.out.println("Fatura:    R$ " + String.format("%.2f", faturaAtual));
        System.out.println("Status:    " + (ativo ? "Ativo" : "Bloqueado"));
        System.out.println("====================================");
    }
}
