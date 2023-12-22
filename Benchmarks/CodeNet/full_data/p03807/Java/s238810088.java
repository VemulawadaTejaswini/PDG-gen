import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] list=new int[N];
		for(int i=0;i<N;i++){
			list[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<N;i++){
			sum=sum+list[i]%2;
		}
		if(sum%2==0){
			System.out.println("YES");			
		}else{
			System.out.println("NO");			
			
		}
	}
}