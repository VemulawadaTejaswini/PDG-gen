import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		String [] ymd = S.split("/");
		
		int m = Integer.parseInt(ymd[1]);
		
		if(m<=4) {
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}

		sc.close();
	}

}