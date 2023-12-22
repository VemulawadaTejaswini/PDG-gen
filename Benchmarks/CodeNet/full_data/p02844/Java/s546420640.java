import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		int cnt = 0;
		for(int i = 0;i < 1000;i++){
			int[] c = {i%10, (i/10)%10, i/100};
			int f = 0;
			for(int j = 0;j < N;j++){
				if(S[j] == c[f] + '0')f++;
				if(f == 3)break;
			}
			if(f == 3)cnt++;
		}
		System.out.println(cnt);
	}
}