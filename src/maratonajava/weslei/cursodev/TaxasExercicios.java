package maratonajava.weslei.cursodev;

public class TaxasExercicios {
    public static void main(String[] args) {
        //What tax will I pay based on my (annual) salary?

        double salary = 70000;

        double fistTax = 9.70; // 0 up to 34712
        double secondTax = 37.35; // 34713 up to 68517
        double tirdTax = 49.50; // 68518 up to ...

        double totalPaymant;
        double totalReceivable;
        
        if (salary <= 34712) {
            totalPaymant = salary / 100 * fistTax;
            totalReceivable = salary - totalPaymant;
            System.out.println("All salary:  " + salary);
            System.out.println("Taxes paid - " + totalPaymant);
            System.out.println("Liquid Salary: " + totalReceivable);

        } else if (salary >= 34713 && salary <= 68517) {
            totalPaymant = salary / 100 * secondTax;
            totalReceivable = salary - totalPaymant;
            System.out.println("All salary:  " + salary);
            System.out.println("Taxes paid - " + totalPaymant);
            System.out.println("Liquid Salary: " + totalReceivable);
        } else {
            totalPaymant = salary / 100 * tirdTax;
            totalReceivable = salary - totalPaymant;
            System.out.println("All salary:  " + salary);
            System.out.println("Taxes paid - " + totalPaymant);
            System.out.println("Liquid Salary: " + totalReceivable);
        }
    }
}   
