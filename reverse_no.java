/*Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format
Sample Input
123456789
Sample Output
987654321
Explanation
You've to calculate the reverse in a number, not just print the reverse.*/
import java.util.*;
public class reverse_no {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no to print it's reverse ");
		int n=sc.nextInt();
		int r=0;
		while (n>0){
			r=(r*10)+(n%10);
			n=n/10;
		}
	System.out.println("The no after reverse is "+r);
    }
}


