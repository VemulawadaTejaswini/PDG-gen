import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i = 0; i < N; i++) p[i] = sc.nextInt();
		boolean check = true;
		for(int i = 1; i < N; i++) if(p[i - 1] >= p[i]) check = false;

		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				int tmp = p[i]; p[i] = p[j]; p[j] = tmp;
				boolean flg = true;
				for(int k = 1; k < N; k++) if(p[k - 1] >= p[k]) flg = false;
				check |= flg;
				tmp = p[i]; p[i] = p[j]; p[j] = tmp;
			}
		}
		System.out.println(check ? "YES" : "NO");
	}
}