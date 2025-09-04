package maratonajava.weslei.cursodev;

public class EstruturasDeRepeticaoBreakExercicio {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele poder se parcelado.
        //Sendo o valor minimo de parcela de 1000;
        //valor do carro 80.000
        double valorDoCarro = 40000;

        for (int parcelaMinima = 1; parcelaMinima <= valorDoCarro; parcelaMinima++) {
            double valorDasParcelas = valorDoCarro / parcelaMinima;
            if (valorDasParcelas >= 1000) {
                System.out.println(valorDasParcelas + " quantidade: " + parcelaMinima);
            } else {
                break;
            }
        }
    }
}
