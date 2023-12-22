import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String ans = "ABC";
		if(n >= 1000)ans = ans.replace("C", "D");
		System.out.println(ans);
	}

}
