package eldoria;

import java.util.ArrayList;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");

        // Criando uma lista polimórfica de personagens
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Adicionando Magos à lista
        personagens.add(new Mago("Eldoran", 7, 60, 18.0));
        personagens.add(new Mago("Lyra", 6, 55, 16.5));

        // Adicionando Guerreiros à lista
        personagens.add(new Guerreiro("Thorin", 8, 95, 14.0));
        personagens.add(new Guerreiro("Brienne", 5, 88, 12.5));

        // Percorrendo a lista e demonstrando polimorfismo
        for (int indice = 0; indice < personagens.size(); indice++) {
            Personagem personagem = personagens.get(indice);

            System.out.println("--- Herói " + (indice + 1) + " ---");
            System.out.println();
            personagem.exibirStatus();
            personagem.usarHabilidade();

            // Apenas magos registram e auditam ações.
            if (personagem instanceof Mago) {
                Auditavel personagemAuditavel = (Auditavel) personagem;
                personagemAuditavel.registrarAcao("Conjurou bola de fogo");
                personagemAuditavel.auditarAcoes();
            }

            // Casting explícito para usar o método protegido de Personagem.
            Personagem personagemAbenocoado = (Personagem) personagem;
            personagemAbenocoado.atribuirBencao(2.0);
            System.out.println("Novo poder base após bênção: " + personagemAbenocoado.getPoderBase());
            personagemAbenocoado.exibirStatus();
            System.out.println();
        }

        // Compara dois personagens usando equals().
        Personagem primeiroPersonagem = personagens.get(0);
        Personagem segundoPersonagem = personagens.get(2);
        String resultadoComparacao;

        if (primeiroPersonagem.equals(segundoPersonagem)) {
            resultadoComparacao = "iguais";
        } else {
            resultadoComparacao = "diferentes";
        }

        System.out.println("Comparando, " + primeiroPersonagem.getNome() + " e "
                + segundoPersonagem.getNome() + " são " + resultadoComparacao + ".");
    }
}
