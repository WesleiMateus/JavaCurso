package maratonajava.weslei.cursodev;

public class EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        //numeros pares de 0 a 1 mi

        for(long isPar = 0; isPar <= 100; isPar++) {
            long resultado = isPar % 2;
            if (resultado == 0) {
                System.out.println(isPar);
            }
        }
        
    }
}
