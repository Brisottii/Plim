public class Main {
    public static void main(String[] args) {

        System.out.println("======= Sistema Plim - Fintech =======\n");

        // ---- Instanciando Usuario ----
        Usuario usuario = new Usuario("Barbara Brisotti", "barbara@email.com", "senha123", "123.456.789-00", "(11) 91234-5678", 3240.00);
        usuario.exibirPerfil();

        System.out.println("\nAutenticação (senha correta): " + usuario.autenticar("barbara@email.com", "senha123"));
        System.out.println("Autenticação (senha errada):  " + usuario.autenticar("barbara@email.com", "errada"));

        System.out.println("\nSaldo suficiente para R$500? " + usuario.possuiSaldoSuficiente(500.00));
        System.out.println("Saldo suficiente para R$5000? " + usuario.possuiSaldoSuficiente(5000.00));

        // ---- Instanciando Cartao ----
        System.out.println();
        Cartao cartao = new Cartao("**** **** **** 4821", "Barbara Brisotti", "09/29", 5000.00);
        cartao.exibirResumo();

        System.out.println("\nRealizando compras:");
        cartao.realizarCompra(890.00);
        cartao.realizarCompra(6000.00); // deve ser negada
        cartao.pagarFatura(500.00);     // pagamento parcial

        // ---- Polimorfismo: Despesa e Receita via referência da superclasse ----
        System.out.println("\n--- Transações via polimorfismo ---");

        Transacao t1 = new Despesa(1, 350.00, "23/04/2026", "Compras do mês", "Mercado", "Pix", false);
        Transacao t2 = new Receita(2, 4800.00, "01/04/2026", "Salário abril", "Trabalho", "Empresa", true);

        // Mesmo método, comportamentos diferentes (polimorfismo)
        t1.exibirResumo();
        t2.exibirResumo();

        // Downcast para acessar métodos específicos
        Despesa despesa = (Despesa) t1;
        despesa.marcarComoPaga();
        despesa.calcularImpactoNoSaldo(usuario.getSaldoDisponivel());

        Receita receita = (Receita) t2;
        System.out.println(receita.projetarReceitaAnual());

        System.out.println("\n======= Fim da execução =======");
    }
}
