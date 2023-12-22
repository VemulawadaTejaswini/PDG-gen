import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String t0 = sc.nextLine();
      	String t = sc.nextLine();
		String S[] = t.split("");
		String  tmp = S[0];
		int count = 1;

		for(int i = 1; i < S.length;i++) {
			String s = S[i];
			if(tmp.equals(s)) {
				
			}else {
				count++;
			}
			tmp = s;
		}
		System.out.println(count);
	}

}

