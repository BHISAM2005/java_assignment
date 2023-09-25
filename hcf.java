import java.util.*;
public class hcf{
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
        System.out.println("HCF of given no is "+((n1*n2)/i));
    }
}