import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[]x = new String[3];
		String ans = "";
		
		for(int i = 0; i < 3; i++){
			x[i] = sc.nextLine();
			ans = ans + x[i].charAt(i);
		}
		System.out.println(ans);
	}
}
