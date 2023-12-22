import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static String ans = "No";

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0;i<=25;i++){
			for(int j=0;j<=25;j++){
				if (N==(4*i+7*j)) {
					ans="Yes";
				}
			}
		}
		System.out.println(ans);
		//System.out.print(ans);
    }
}