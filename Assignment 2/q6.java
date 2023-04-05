import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of seconds =");
		double sec= sc.nextDouble();
		double dis= (1.0/2.0)*(32.174)*(sec*sec);
		System.out.println("the distance that the rock traveled is ="+dis);
		
	}

}
