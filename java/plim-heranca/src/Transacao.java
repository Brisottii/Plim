// Superclasse: representa qualquer transação financeira no sistema Plim
public class Transacao {

    private Integer id;
    private Double valor;
    private String data;
    private String descricao;
    private String categoria;

    // Construtor padrão
    public Transacao() {
    }

    // Construtor com parâmetros
    public Transacao(Integer id, Double valor, String data, String descricao, String categoria) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    // Getters e Setters (Encapsulamento)
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("Valor inválido. Deve ser maior que zero.");
        }
    }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Método que será sobrescrito pelas subclasses (polimorfismo)
    public String getTipo() {
        return "Transação";
    }

    // Método com lógica real
    public void exibirResumo() {
        System.out.println("----------------------------------");
        System.out.println("Tipo:      " + getTipo());
        System.out.println("ID:        " + id);
        System.out.println("Valor:     R$ " + String.format("%.2f", valor));
        System.out.println("Data:      " + data);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descrição: " + descricao);
        System.out.println("----------------------------------");
    }
}
