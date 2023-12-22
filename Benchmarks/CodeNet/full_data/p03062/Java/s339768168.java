import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int input = sc.nextInt();
		long n[] = new long [input];
		for (int i=0 ; i<input ; i++ ){
			long v = sc.nextInt();
			n[i]=v;
		}

		for (int i=0;i<=input-1;i++){
			if(i==0){
				if(n[i]+n[i+1]<0){
					n[i]=-n[i];
					n[i+1]=-n[i+1];
				}
			}
			else if(i==input-1){
				if( n[i]+n[i-1]<0){
					n[i]=-n[i];
					n[i-1]=-n[i-1];
				}
			}
			else if(n[i]<0){
				if(n[i-1]>n[i+1] && n[i]+n[i+1]<0){
					n[i]=-n[i];
					n[i+1]=-n[i+1];
					i=0;
					continue;
				}else if(n[i-1]<n[i+1] && n[i]+n[i-1]<0){
					n[i]=-n[i];
					n[i-1]=-n[i-1];
					i=0;
					continue;
				}else{}
			}
		}

		long ans = 0;
		for (int j=0 ; j<input ; j++ ){
			ans += n[j];
		}
		System.out.println(ans);
	}

}