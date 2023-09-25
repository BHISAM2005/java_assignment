/*Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.

{...} Code Editor

C++
 */
// fibonacci series program
import java.util.*;
public class fibonacci_nth {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term ");
		int n=sc.nextInt();
		int a=0,b=1,c=0;
		for(int i=0;i<n;i++){
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println("nth fibonacci no "+c);
    }
}

