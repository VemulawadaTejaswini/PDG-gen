import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		String[] split = in.split("/");
		if(Integer.parseInt(split[0]) <= 2019) {
			if(Integer.parseInt(split[0]) == 2019 && Integer.parseInt(split[1]) <= 4) {
				System.out.println("Heisei");
			}else {
				System.out.println("Heisei");
			}
		}else {
			System.out.println("TBD");
		}
		
	}

}
