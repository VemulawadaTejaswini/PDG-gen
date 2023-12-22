import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static int V [];
	static int C [];
	static int ans=0;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		//long Var_name = sc.nextLong();
    	N=sc.nextInt();
    	V=new int[N+1];
    	C=new int[N+1];

    	for(int i=1;i<=N;i++){
    		V[i]=sc.nextInt();
    		//C[i]=sc.nextInt();
    	}


    	for(int i=1;i<=N;i++){
    		C[i]=sc.nextInt();
    	}

    	for(int i=1;i<=N;i++){
    		if (V[i]>C[i]) {
    			ans=ans+(V[i]-C[i]);
    		}
    	}



		System.out.println(ans);
		//System.out.print(ans);
    }
}