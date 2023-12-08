package Practice;

import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        double money;
        int month;
        double interRate ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input money");

        money = scanner.nextDouble();
        System.out.println("input month");

        month = scanner.nextInt();
        System.out.println("input interRate");

        interRate = scanner.nextDouble();
        double totalInterestRate = 0;
        for (int i = 0; i < money; i++) {
            totalInterestRate += money * (interRate/100)/12 * month;
        }
        System.out.println(totalInterestRate);
    }
}
