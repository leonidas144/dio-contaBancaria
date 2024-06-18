import java.util.HashMap;
import java.util.Map;

public class AuthManager {
    private Map<String, Usuario> usuarios;

    public AuthManager() {
        this.usuarios = new HashMap<>();
    }

    public boolean registrarUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getUsername())) {
            return false; // Usuário já existe
        }
        usuarios.put(usuario.getUsername(), usuario);
        return true;
    }

    public boolean autenticar(String username, String password) {
        Usuario usuario = usuarios.get(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}