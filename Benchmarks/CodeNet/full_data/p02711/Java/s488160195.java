import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		
		String ans = "No";
		for(String ss : s) {
			if(ss.equals("7")) {
				ans = "Yes";
				break;
			}
		}

		System.out.println(ans);
	}


}
