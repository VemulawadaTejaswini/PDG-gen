import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		d = sc.nextInt();

		// 出力
		System.out.println(n%(d*2+1)==0?n/(d*2+1):n/(d*2+1)+1);
	}

	public static void main(String[] args){
		new Main();
	}
}