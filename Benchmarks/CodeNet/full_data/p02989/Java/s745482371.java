import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static int [] Ary;
	static int ans=0;
	
	//分けて宣言する場合
	//int [] var;
	//var = new int [num];
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Ary = new int[N+1];
		for(int i=1;i<=N;i++){
			Ary[i] = sc.nextInt();
		}

		Arrays.sort(Ary);
		
		if (Ary[N/2]<Ary[N/2+1]) {
			ans=Ary[N/2+1]-Ary[N/2];
		}
		else{
			ans=0;
		}
		System.out.println(ans);
		//System.out.print(ans);
    }
    //関数定義
	//public static int funk(long X,long A) {
    //    return ;    
    //}
}
