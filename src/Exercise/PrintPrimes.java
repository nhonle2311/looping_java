package Exercise;
public class PrintPrimes {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        for (int N = 2; count < numbers; N++) {
            boolean isPrime = true;
            if (N < 2){
                isPrime = false;
            }else {
                for (int i = 2; i <= Math.sqrt(N) ; i++) {
                    if (N % i == 0 ){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.println(N + "");
                count++;
            }
        }

    }
}