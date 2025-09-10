package maratonajava.weslei.cursodev;

public class Operadores {
   public static void main(String[] args) {

      int age = 34;
      double wage  = 4100;

      boolean isPersonWageCorrect = (age <= 30 && wage >= 3381) || (age >= 30 && wage >= 4612); 

      System.out.println(isPersonWageCorrect);
   }
}
