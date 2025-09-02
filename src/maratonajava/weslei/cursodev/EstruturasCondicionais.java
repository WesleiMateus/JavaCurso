package maratonajava.weslei.cursodev;

public class EstruturasCondicionais {
   public static void main(String[] args) {

      // boolean isPersonWageCorrect = (age <= 30 && wage >= 3381) || (age >= 30 && wage >= 4612);

      //codigo abaixo representa outra versão do codigo acima

      int age = 31;
      double wage  = 1700;
      boolean isPersonWageCorrect = false;

      if (age <= 30 && wage >= 3381) {
         isPersonWageCorrect = true;
         System.out.println("Primeira Condição --> " + isPersonWageCorrect);
      } else if (age > 30 && wage >= 4680) {
         isPersonWageCorrect = true;
         System.out.println("Segunda Condição --> " + isPersonWageCorrect);
      } else {
         isPersonWageCorrect = false;
         System.out.println("Terceira Condição --> " + isPersonWageCorrect);
      }

   }
}
