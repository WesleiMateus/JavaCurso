package maratonajava.weslei.cursodev;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        //Desenvolva um programa que receba como entrada um número inteiro que represente um dos 7 dias da semana e imprima na tela se esse dia é útil, final de semana ou inválido.
        //Considere que Domingo é o dia 1 e Sábado o dia 7.

        byte weekDays = 6;

        switch (weekDays) {
            case 1:
                System.out.println("Monday is a working day");
                break;
            case 2: 
                System.out.println("Tuesday is a working day");
                break;
            case 3: 
                System.out.println("Wednesday is a working day");
                break;
            case 4: 
                System.out.println("Thursday is a working day");
                break;
            case 5: 
                System.out.println("Friday is a weekend day");  
                break;
            case 6: 
                System.out.println("Saturday is a weekend day");
                break;
            case 7: 
                System.out.println("Sunday is a working day");
                break;
        
            default:
                System.out.println("Opção Inválida.");
                break;
        }

    }
}
