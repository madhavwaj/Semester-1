import java.util.Scanner;
public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number between 0 to 1000 is =");
		double n = sc.nextInt();
		int sum, rem, num;
		System.out.println("The number between 0 to 1000 is =");
		num = sc.nextInt();
		sum = 0;
		rem = num % 10;
		num = num / 10;
		sum= sum + rem;
		
		rem = num % 10;
		num = num / 10;
		sum= sum + rem;
		
		rem = num % 10;
		num = num / 10;
		sum= sum + rem;
		
		System.out.println("The sum of digits is " + sum + ".");
	}

}
