package maratonajava.weslei.cursodev;

public class AulaArrays {
    public static void main(String[] args) {
        String [] names = new String[3];
        names[0] = "Weslei";
        names[1] = "Weslei";
        names[2] = "Laura";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("====================================");
        
        
        String [] nomes = {"Weslei", "Laura"};
        System.out.println(nomes[0] + " e " + nomes[1]);

        System.out.println("====================================");

        String [] seiLa = {
            "Weslei", 
            "Laura",
            "Juvenal"
        };
        
        //foreach
        for (String indice : seiLa) {
            System.out.println(indice);
        }
    } 
}
