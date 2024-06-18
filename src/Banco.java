import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;
    private AuthManager authManager;

    public Banco() {
        this.contas = new HashMap<>();
        this.authManager = new AuthManager();
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
        authManager.registrarUsuario(conta.getTitular().getUsuario());
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public boolean transferir(String origemNumero, String destinoNumero, double valor) {
        Conta origem = buscarConta(origemNumero);
        Conta destino = buscarConta(destinoNumero);
        if (origem != null && destino != null) {
            return origem.transferir(destino, valor);
        }
        return false;
    }

    public boolean login(String username, String password) {
        return authManager.autenticar(username, password);
    }
}