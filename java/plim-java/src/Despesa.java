public class Despesa {

    private Integer id;
    private Double valor;
    private String categoria;
    private String data;
    private String descricao;
    private String tipoPagamento;

    // Construtor padrão
    public Despesa() {
    }

    // Construtor com parâmetros
    public Despesa(Integer id, Double valor, String categoria, String data, String descricao, String tipoPagamento) {
        this.id = id;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
        this.descricao = descricao;
        this.tipoPagamento = tipoPagamento;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTipoPagamento() { return tipoPagamento; }
    public void setTipoPagamento(String tipoPagamento) { this.tipoPagamento = tipoPagamento; }

    // Métodos
    public void registrarDespesa() {
        System.out.println("Executando registrarDespesa(): registrando despesa de R$ " + valor + " na categoria " + categoria);
    }

    public void editarDespesa() {
        System.out.println("Executando editarDespesa(): editando despesa de ID " + id);
    }

    public void excluirDespesa() {
        System.out.println("Executando excluirDespesa(): removendo despesa de ID " + id);
    }

    public void categorizarDespesa() {
        System.out.println("Executando categorizarDespesa(): atribuindo categoria '" + categoria + "' à despesa de ID " + id);
    }

    public void calcularTotalMes() {
        System.out.println("Executando calcularTotalMes(): calculando total de despesas do mês de " + data);
    }
}
