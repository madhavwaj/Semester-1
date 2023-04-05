import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary =");
		double s = sc.nextDouble();
		double da = (s)*(40.0/100.0);
		double hra = (s)*(20.0/100.0);
		double gs = da+hra+s;
		System.out.println("DA is = " + da);
		System.out.println("HRA is = " + hra);
		System.out.println("Gross Salary is = " + gs);
		
	}

}
