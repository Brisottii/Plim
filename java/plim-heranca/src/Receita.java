// Subclasse: representa uma receita — herda de Transacao
public class Receita extends Transacao {

    private String origem;
    private Boolean recorrente;

    // Construtor padrão
    public Receita() {
        super();
    }

    // Construtor com parâmetros
    public Receita(Integer id, Double valor, String data, String descricao, String categoria, String origem, Boolean recorrente) {
        super(id, valor, data, descricao, categoria);
        this.origem = origem;
        this.recorrente = recorrente;
    }

    // Getters e Setters
    public String getOrigem() { return origem; }
    public void setOrigem(String origem) { this.origem = origem; }

    public Boolean getRecorrente() { return recorrente; }
    public void setRecorrente(Boolean recorrente) { this.recorrente = recorrente; }

    // Polimorfismo: sobrescreve getTipo() da superclasse
    @Override
    public String getTipo() {
        return "Receita";
    }

    // Polimorfismo: sobrescreve exibirResumo() adicionando campos extras
    @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println("Origem:     " + origem);
        System.out.println("Recorrente: " + (recorrente ? "Sim" : "Não"));
        System.out.println("----------------------------------");
    }

    // Método específico de Receita com lógica real
    public Double calcularImpactoNoSaldo(Double saldoAtual) {
        Double novoSaldo = saldoAtual + getValor();
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
        System.out.println("Após receita de R$ " + String.format("%.2f", getValor()) + ": R$ " + String.format("%.2f", novoSaldo));
        return novoSaldo;
    }

    public String projetarReceitaAnual() {
        if (recorrente) {
            Double totalAnual = getValor() * 12;
            return "Receita anual projetada: R$ " + String.format("%.2f", totalAnual);
        }
        return "Receita não recorrente — sem projeção anual.";
    }
}
