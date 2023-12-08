package Practice;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("input number:");
        if (number < 2){
            System.out.println("not is prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)){
                if (number % i == 0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if (check) System.out.println(number+ "is prime");
            else System.out.println(number + "not is prime");
        }


    }
}
