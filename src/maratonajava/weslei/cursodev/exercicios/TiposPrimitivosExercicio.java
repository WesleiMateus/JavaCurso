package maratonajava.weslei.cursodev.exercicios;

public class TiposPrimitivosExercicio {
   public static void main(String[] args) {
      String name = "Weslei";
      String adress = "Rua 11 - Casa 8";
      double wage = 1562.12;
      String wageReceipitDate = "29/08/2025";

      // System.out.println("Eu "+name+" morando no endreço "+adress+", confirmo que recebi o salário de "+wage+" na data: "+date);

      System.out.printf("Eu %s morando no endereço %s, confirmo que recebi o salário de %.2f na data de: %s", name, adress, wage, wageReceipitDate);
   }
}
