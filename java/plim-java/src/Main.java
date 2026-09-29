public class Main {
    public static void main(String[] args) {

        System.out.println("=== Sistema Plim - Fintech ===\n");

        // Testando classe Usuario
        Usuario usuario = new Usuario("Barbara Brisotti", "barbara@email.com", "senha123", "123.456.789-00", "(11) 91234-5678", 3240.00);
        usuario.cadastrar();
        usuario.visualizarSaldo();
        usuario.atualizarPerfil();

        System.out.println();

        // Testando classe Despesa
        Despesa despesa = new Despesa(1, 350.00, "Mercado", "23/04/2026", "Compras do mês", "Pix");
        despesa.registrarDespesa();
        despesa.categorizarDespesa();
        despesa.calcularTotalMes();

        System.out.println();

        // Testando classe Meta
        Meta meta = new Meta(1, "Viagem para Europa", 20000.00, 3522.00, "Jul/2026", "em alerta");
        meta.criarMeta();
        meta.atualizarProgresso();
        meta.verificarStatus();
        meta.calcularProgresso();

        System.out.println();

        // Testando classe Cartao
        Cartao cartao = new Cartao("**** **** **** 4821", "Barbara Brisotti", "09/29", 5000.00, 2760.00, 890.00, true);
        cartao.consultarLimite();
        cartao.visualizarFatura();
        cartao.bloquearCartao();

        System.out.println("\n=== Fim da execução ===");
    }
}