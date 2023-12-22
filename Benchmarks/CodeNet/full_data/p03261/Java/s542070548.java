import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N_str = sc.nextLine();
		final int N = Integer.parseInt(N_str);
		String W[] = new String[N];
		for(int i = 0; i < N; i++) {
			W[i] = sc.nextLine();
		}
		
		boolean flag = true;
		
		for(int i = 0; i < N; i++) {
			if(i >= 1) {
				if(W[i].charAt(0) != W[i - 1].charAt(W[i - 1].length() - 1)) {
					flag = false;
				}
			}
			for(int j = 0; j < i; j++) {
				if(W[i].equals(W[j])) {
					flag = false;
				}
			}
		}
		
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
