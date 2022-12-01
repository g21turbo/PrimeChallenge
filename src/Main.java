public class Main {


    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number");
        System.out.println("5 is " + (isPrime(5) ? "" : "NOT ") + "a prime number");
        System.out.println("6 is " + (isPrime(6) ? "" : "NOT ") + "a prime number");
    }

    public static boolean isPrime(int wholeNumber){
        int primeNumberCounter = 0;
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}
