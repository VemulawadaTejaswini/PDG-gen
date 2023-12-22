import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();

		f = sc.nextInt();
        ans += f;
		for(int i=1;i<n-1;i++){
			int r = sc.nextInt();
			ans += Math.min(f,r);
			f = r;
		}
		ans += f;

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}