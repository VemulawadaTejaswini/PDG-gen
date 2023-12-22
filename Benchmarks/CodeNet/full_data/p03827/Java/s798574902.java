import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x = 0;
		int ans = 0;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		String[] str = S.split("");
		for(int i = 0; i < N; i++) {
			if(str[i].equals("I")) x++;
			else x--;
			if(ans < x) ans = x;
	    }
		System.out.println(ans);
		scan.close();
	}

}
