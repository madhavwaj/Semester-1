import java.util.Scanner;
public class q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance between two cities in km");
		double d = sc.nextDouble();
		double m = d*1000.0;
		double f = d*3280.8399;
		double i = d*39370.0787;
		double cm =d*100000.0;
		 100000
		System.out.println("Distance in meter = "+ m);
		System.out.println("Distance in feet is = "+ f);
		System.out.println("Distance in inches is = "+ i);
		System.out.println("Distance in centimeters is ="+ cm);
		
		
	}
}
