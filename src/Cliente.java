public class Cliente {
    private String nome;
    private String cpf;
    private Usuario usuario;

    public Cliente(String nome, String cpf, Usuario usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}