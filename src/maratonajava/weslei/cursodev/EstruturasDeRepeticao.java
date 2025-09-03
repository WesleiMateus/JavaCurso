package maratonajava.weslei.cursodev;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int counter = 0;
        
        while (counter < 10) {
            System.out.println(counter);
            if (counter == 9) {
                System.out.println("========================================");
            }
            counter++;
            
        }

        ////////////////
        counter = 4;
        do {
            System.out.println(counter);
            if (counter == 9) {
                System.out.println("========================================");
            }
            counter++;
        } while (counter < 10);

        /////////////////////////////
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
