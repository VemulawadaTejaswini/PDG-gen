import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		long sum = 0;
		for(int i=1;i<=N;i++){
			if ((i%3)!=0) {
				if ((i%5)!=0) {
					sum=sum+i;
				}
				
			}
		}




		System.out.println(sum);
		//System.out.print(ans);
    }
}