//java program for armstrong no
import java.util.Scanner;
public class armstrong_no2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num = sc.nextInt();
        int sum = 0;
        int original = num;
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        num = original;
        while (num > 0) {
            int last = num % 10;
            sum = sum + (int) Math.pow(last, digits);
            num = num / 10;}
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

//  OR
/*java program for armstrong no
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int original = num;
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        num = original;
        while (num > 0) {
            int last = num % 10;
            sum = sum + (int) Math.pow(last, digits);
            num = num / 10;}
        if (sum == original) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

 */