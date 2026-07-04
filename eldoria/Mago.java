package eldoria;

import java.util.ArrayList;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem implements Auditavel {
    private final ArrayList<String> acoesRegistradas;

    // Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.acoesRegistradas = new ArrayList<>();
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + getNome() + " conjura uma bola de fogo!");
    }

    @Override
    public void registrarAcao(String acao) {
        acoesRegistradas.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("Ações auditadas:");
        acoesRegistradas.forEach(acao -> System.out.println("- " + acao));
    }
}
