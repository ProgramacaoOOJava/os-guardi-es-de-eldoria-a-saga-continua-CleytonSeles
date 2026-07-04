package eldoria;

public interface Auditavel {
    void registrarAcao(String acao);

    void auditarAcoes();
}