import java.util.ArrayList;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
      System.out.println("Os Guardiões se preparam para a batalha!\n");
      ArrayList<Personagem> var1 = new ArrayList<>();
      var1.add(new Mago("Eldoran", 7, 60, 18.0));
      var1.add(new Mago("Lyra", 5, 55, 16.5));
      var1.add(new Guerreiro("Thorin", 8, 95, 14.0));
      var1.add(new Guerreiro("Brienne", 6, 90, 13.5));

      for (Personagem var3 : var1) {
         System.out.println(var3.getClasse());
         var3.exibirStatus();
         var3.usarHabilidade();
         System.out.println();
      }
   }
}


