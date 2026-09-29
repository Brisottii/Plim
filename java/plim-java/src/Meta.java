public class Meta {

    private Integer id;
    private String nome;
    private Double valorTotal;
    private Double valorAcumulado;
    private String prazo;
    private String status;

    // Construtor padrão
    public Meta() {
    }

    // Construtor com parâmetros
    public Meta(Integer id, String nome, Double valorTotal, Double valorAcumulado, String prazo, String status) {
        this.id = id;
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.valorAcumulado = valorAcumulado;
        this.prazo = prazo;
        this.status = status;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }

    public Double getValorAcumulado() { return valorAcumulado; }
    public void setValorAcumulado(Double valorAcumulado) { this.valorAcumulado = valorAcumulado; }

    public String getPrazo() { return prazo; }
    public void setPrazo(String prazo) { this.prazo = prazo; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // Métodos
    public void criarMeta() {
        System.out.println("Executando criarMeta(): criando meta '" + nome + "' com valor alvo de R$ " + valorTotal);
    }

    public void atualizarProgresso() {
        System.out.println("Executando atualizarProgresso(): atualizando valor acumulado da meta '" + nome + "' para R$ " + valorAcumulado);
    }

    public void verificarStatus() {
        System.out.println("Executando verificarStatus(): verificando status da meta '" + nome + "' - status atual: " + status);
    }

    public void excluirMeta() {
        System.out.println("Executando excluirMeta(): removendo meta de ID " + id);
    }

    public void calcularProgresso() {
        System.out.println("Executando calcularProgresso(): calculando percentual atingido da meta '" + nome + "'");
    }
}
