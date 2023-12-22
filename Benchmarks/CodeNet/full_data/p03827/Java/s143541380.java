import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int  N = sc.nextInt();
		String S = sc.next();
		char[] c = S.toCharArray();
		int max = 0;
		int tmp = 0;
		for(int i = 0; i < N; i++) {
			if(c[i] == 'I') {
				tmp++;
				if(tmp > max) {
					max = tmp;
				}
			}else if(c[i] =='D') {
				tmp--;
			}
		}
		System.out.println(max);
		}
}