// Subclasse: representa uma despesa — herda de Transacao
public class Despesa extends Transacao {

    private String tipoPagamento;
    private Boolean paga;

    // Construtor padrão
    public Despesa() {
        super();
    }

    // Construtor com parâmetros
    public Despesa(Integer id, Double valor, String data, String descricao, String categoria, String tipoPagamento, Boolean paga) {
        super(id, valor, data, descricao, categoria);
        this.tipoPagamento = tipoPagamento;
        this.paga = paga;
    }

    // Getters e Setters
    public String getTipoPagamento() { return tipoPagamento; }
    public void setTipoPagamento(String tipoPagamento) { this.tipoPagamento = tipoPagamento; }

    public Boolean getPaga() { return paga; }
    public void setPaga(Boolean paga) { this.paga = paga; }

    // Polimorfismo: sobrescreve getTipo() da superclasse
    @Override
    public String getTipo() {
        return "Despesa";
    }

    // Polimorfismo: sobrescreve exibirResumo() adicionando campos extras
    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Pagamento: " + tipoPagamento);
        System.out.println("Paga:      " + (paga ? "Sim" : "Não"));
        System.out.println("----------------------------------");
    }

    // Método específico de Despesa com lógica real
    public void marcarComoPaga() {
        this.paga = true;
        System.out.println("Despesa '" + getDescricao() + "' marcada como paga.");
    }

    public Double calcularImpactoNoSaldo(Double saldoAtual) {
        Double novoSaldo = saldoAtual - getValor();
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
        System.out.println("Após despesa de R$ " + String.format("%.2f", getValor()) + ": R$ " + String.format("%.2f", novoSaldo));
        return novoSaldo;
    }
}
