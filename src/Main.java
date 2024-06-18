public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Usuario usuario1 = new Usuario("joao", "123");
        Usuario usuario2 = new Usuario("maria", "456");

        Cliente cliente1 = new Cliente("João", "111.111.111-11", usuario1);
        Cliente cliente2 = new Cliente("Maria", "222.222.222-22", usuario2);

        Conta conta1 = new Conta("12345", cliente1);
        Conta conta2 = new Conta("67890", cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Autenticação
        if (banco.login("joao", "123")) {
            System.out.println("Login de João bem-sucedido!");
            conta1.depositar(1000);
            System.out.println("Saldo de João: " + conta1.getSaldo());

            banco.transferir("12345", "67890", 200);
            System.out.println("Saldo de João após transferência: " + conta1.getSaldo());
            System.out.println("Saldo de Maria após receber transferência: " + conta2.getSaldo());
        } else {
            System.out.println("Login de João falhou!");
        }
    }
}
