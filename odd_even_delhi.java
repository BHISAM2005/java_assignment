/*
Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as
follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or 
sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria 
can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be 
 allowed to run on Sunday?
Input Format
The first line contains N , then N integers follow each denoting the number of the car.
Constraints
N<=1000 Car No >=0 && Car No <=1000000000
Output Format
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !
Sample Input
2
12345
12134
Sample Output
Yes
No
*/

import java.util.*;
public class odd_even_delhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int n1 = sc.nextInt();
            int even_no = 0;
            int odd_no = 0;
            while(n1!=0){
                int r = n1%10;
                if((r)%2==0){
                    even_no+=n1%10;
                }
                else{
                    odd_no+=n1%10;
                }
                n1=n1/10;
            }
            int e = even_no%4;
            int f = odd_no%3;
            if((e==0)||(f==0)){
            System.out.println("Yes");
            }
            else{
            System.out.println("No");
            }
            n--;
        }
    }
}