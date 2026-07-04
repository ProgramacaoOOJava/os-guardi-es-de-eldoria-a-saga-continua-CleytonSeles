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
        for (Personagem personagem : personagens) {
            System.out.println(personagem.getClasse());
            System.out.println();
            System.out.println(personagem);
            personagem.usarHabilidade();

            // Identifica dinamicamente o tipo real do personagem.
            if (personagem instanceof Mago) {
                System.out.println("O personagem " + personagem.getNome() + " é um Mago de nível " + personagem.getNivel() + ".");
            } else if (personagem instanceof Guerreiro) {
                System.out.println("O personagem " + personagem.getNome() + " é um Guerreiro de nível " + personagem.getNivel() + ".");
            }

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
