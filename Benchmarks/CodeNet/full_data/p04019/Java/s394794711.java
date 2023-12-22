import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String route = sc.next();
		sc.close();
		
		String ans = "Yes";
		if(route.contains("N")){
			if(!route.contains("S")){
				ans = "No";
			}
		}
		if(route.contains("W")){
			if(!route.contains("E")){
				ans = "No";
			}
		}
		System.out.println(ans);
	}
}