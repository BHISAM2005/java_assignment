/*Take N (number in binary format). Write a function that converts it to decimal format and 
Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20. */
import java.util.*;
public class binary_to_decimal {
    public static void main(String args[]) {
int N,c=0,dec=0,n;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary no ");
		N=sc.nextInt();
		n=N;
		while(n>0){
		c+=1;
		n/=10;
		}
		for(int i=0;i<=c;i++){
			dec+=((N%10)*Math.pow(2,i));
			N/=10;}
		System.out.print("decimal value of binary no is "+dec);
    }
}

