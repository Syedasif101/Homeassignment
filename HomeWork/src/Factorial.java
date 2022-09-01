
import java.util.Scanner;

class Factorial{
	public static void main(String args[]) {
		int i,fact;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of number"+ n + fact);
	}
}