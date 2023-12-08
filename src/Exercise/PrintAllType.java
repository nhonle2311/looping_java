package Exercise;

import java.util.Scanner;

public class PrintAllType {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1 Print the rectangle");
        System.out.println("2 Print the square triangle");
        System.out.println("3 Print the isosceles triangle");
        System.out.println("4 Exit");
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("input number 1-4: ");
        number = scanner.nextInt();
        if (number > 0 && number <5){
            if (number == 1) {
                int rows = 5;
                int col = 10;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
            } else if (number == 2){
                int col = 5;
                for (int i = 0; i < col; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for (int i = col; i >= 1; i--) {
                    for (int j = 1; j <= i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }else if (number == 3){
                int col = 5;
                for (int i = 0; i <5 ; i++) {
                    for (int j = 0; j < col - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }else {
                System.out.println("exit");
            }
        }
    }
}
