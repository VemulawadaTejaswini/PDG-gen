import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		sc.close();

		String ans = "";
	
		String[] sArray = s.split("");



		for(int i = 0; i < s.length(); i++){
			if(sArray[i] == "1") {
				ans = ans + "1";
			} else if(sArray[i] == "0") {
				ans = ans + "0"; 
			} else {
				ans = ans + "\b";
			}
		}
		System.out.println(ans);
	}
}