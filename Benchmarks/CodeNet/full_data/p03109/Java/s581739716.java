import java.util.Scanner;

class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		String[] split = in.split("/");
		if(Integer.parseInt(split[0]) >= 2019) {
			if(Integer.parseInt(split[1]) >= 4) {
				if(Integer.parseInt(split[2]) >= 30) {
					System.out.println("Heisei");
				}
			}
		}else {
			System.out.println("TBD");
		}
		
	}

}