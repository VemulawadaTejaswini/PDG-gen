import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int answer = 0;
		
		if(s.charAt(0) == 1) answer++;
		if(s.charAt(1) == 1) answer++;
		if(s.charAt(2) == 1) answer++;
		
		System.out.println(answer);
	}
}
