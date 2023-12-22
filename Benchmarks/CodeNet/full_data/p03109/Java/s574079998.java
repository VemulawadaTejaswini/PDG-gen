import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String day = scan.next();
		
		int year = Integer.parseInt(day.substring(0,4));
		int mon = Integer.parseInt(day.substring(5,7));
		
		if(year>=2019 && mon >=5) {System.out.println("TBD");}
		else System.out.println("Heisei");
		
	}

}
