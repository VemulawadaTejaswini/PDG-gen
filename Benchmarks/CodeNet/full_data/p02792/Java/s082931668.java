import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= n;j++) {
				String ii = String.valueOf(i);
				String jj = String.valueOf(j);
				int iii = ii.length();
				int jjj = jj.length();
				if(ii.substring(0,1).equals(jj.substring(jjj-1,jjj))&&
						jj.substring(0,1).equals(ii.substring(iii-1,iii))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}