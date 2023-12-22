import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] ymd = s.split("/");
		if (Integer.parseInt(ymd[0]) < 2019) {
			System.out.println("Heisei");
		} else if (Integer.parseInt(ymd[0]) > 2019) {
			System.out.println("TBD");
		} else {
			if (Integer.parseInt(ymd[1]) <= 4) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		}
    }
  
}
