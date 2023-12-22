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
				if(ii.substring(0,1).equals(jj.substring(jj.length()-1,jj.length()))&&
						jj.substring(0,1).equals(ii.substring(ii.length()-1,ii.length()))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}