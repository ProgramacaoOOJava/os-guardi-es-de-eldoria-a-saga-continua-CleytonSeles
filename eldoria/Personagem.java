package eldoria;

import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class Personagem {
    // Atributos privados para garantir o encapsulamento.
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor que inicializa todos os atributos do personagem.
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    // Método abstrato que será implementado pelas subclasses.
    public abstract void usarHabilidade();

    // Exibe os dados do personagem com formatação clara.
    public void exibirStatus() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Classe: " + classe + "\n"
                + "Nível: " + nivel + "\n"
                + "Pontos de Vida: " + pontosDeVida + "\n"
                + "Poder Base: " + poderBase;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Personagem other
                && Objects.equals(nome, other.nome)
                && Objects.equals(classe, other.classe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}
