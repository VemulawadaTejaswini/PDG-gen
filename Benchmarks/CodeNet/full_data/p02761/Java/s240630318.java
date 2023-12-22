import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n,m;
		String num = new String();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();m=sc.nextInt();
		int[] s = new int[m];
		int[] c = new int[m];

		for(int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}

		for(int i = 0 ; i < 1000; i++) {//1to1000までの数
			int[] a = new int[3];
			a[0] =i/100;a[1]=(i%100)/10;a[2]=i%10;
			for(int j = 0 ; j < m; j++) {
				if(a[s[j]-1]!=c[j]) {
					break;
				}else {
					if(j == m-1) {
						System.out.println(i);
						return;
					}
				}
			}
		}
		System.out.println(-1);
		return;




	}

}
