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
    public Cartao(String numeroCartao, String titular, String validade, Double limiteTotal, Double limiteDisponivel, Double faturaAtual, Boolean ativo) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.validade = validade;
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteDisponivel;
        this.faturaAtual = faturaAtual;
        this.ativo = ativo;
    }

    // Getters e Setters
    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public Double getLimiteTotal() { return limiteTotal; }
    public void setLimiteTotal(Double limiteTotal) { this.limiteTotal = limiteTotal; }

    public Double getLimiteDisponivel() { return limiteDisponivel; }
    public void setLimiteDisponivel(Double limiteDisponivel) { this.limiteDisponivel = limiteDisponivel; }

    public Double getFaturaAtual() { return faturaAtual; }
    public void setFaturaAtual(Double faturaAtual) { this.faturaAtual = faturaAtual; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    // Métodos
    public void bloquearCartao() {
        System.out.println("Executando bloquearCartao(): bloqueando cartão do titular " + titular);
    }

    public void desbloquearCartao() {
        System.out.println("Executando desbloquearCartao(): desbloqueando cartão do titular " + titular);
    }

    public void visualizarFatura() {
        System.out.println("Executando visualizarFatura(): exibindo fatura atual de R$ " + faturaAtual + " do titular " + titular);
    }

    public void consultarLimite() {
        System.out.println("Executando consultarLimite(): limite disponível de R$ " + limiteDisponivel + " de R$ " + limiteTotal);
    }

    public void solicitarNovoCartao() {
        System.out.println("Executando solicitarNovoCartao(): solicitando emissão de novo cartão para " + titular);
    }
}
