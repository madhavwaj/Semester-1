import java.util.Scanner;
public class q5 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enetr the radius of the hemisphere = ");
	 double r =sc.nextDouble();
	
	 double sura= (3.0)*Math.PI*(r*r);
	 double vol= (2.0/3.0)*Math.PI*(r*r*r);
	 System.out.println("The surface area of the hemisphere is = "+ sura);
	 System.out.println("The volume of the hemisphere is = "+vol);
	}

	
}
