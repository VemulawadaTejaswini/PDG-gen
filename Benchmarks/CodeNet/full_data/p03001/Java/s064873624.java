import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		double w=Double.parseDouble(scan.next());
		double h=Double.parseDouble(scan.next());
		double x=Double.parseDouble(scan.next());
		double y=Double.parseDouble(scan.next());
		
		System.out.print(w*h/2+" ");
		
		if (x*2==w&&y*2==h) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
}
}
//end