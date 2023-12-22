import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,r,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		l = sc.nextInt();
		r = sc.nextInt();

		int ans = 2020;

		for(int i=l;i<r;i++){
			ans = ans>(i*(i+1))%2019?(i*(i+1))%2019:ans;
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}