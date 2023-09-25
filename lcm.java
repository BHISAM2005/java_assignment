/*Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.

Input Format
Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Output Format
Sample Input
4 
6
Sample Output
12
Explanation
The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2. */

import java.util.*;
public class lcm{
    public static void main(String args[]) {
int n1,n2,g,l,same=0,i;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
		n1=sc.nextInt();
        System.out.println("Enter another no ");
		n2=sc.nextInt();
		if(n1>n2){
			g=n1;
			l=n2;}
		else if(n2>n1){
			g=n2;
			l=n1;}
		else{
			same=1;
			l=n1;
			g=n1;}
		for(i=g ;i<=(l*g) ;i+=g){
			if(same==1)
			break;
			if((i%l==0) && (i%g==0))
			break;}
		System.out.println("LCM of given no is "+i);
        //System.out.println("HCF of given no is"+((n1*n2)/i));
    }
}