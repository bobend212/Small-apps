
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

    	int number = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("How many numbers do you want display? (insert) ");

        if (inp.hasNextInt()) {
        	number = inp.nextInt();
        } else {
        	System.out.println("Parameter is not accepted");
        }

        for (int i = 1; i <= number; i++) {

            if (i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3 == 0) {
                System.out.println("Fizz");
            }
            else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
        inp.close();
    }
}
