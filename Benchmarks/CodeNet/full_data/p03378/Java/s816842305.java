import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int m = sc.nextInt();
		int x = sc.nextInt();

		int[]a=new int[n+1];
		sc = new Scanner(System.in);
		int pn=0;
		int p0=0;
		for(int i =0; i<=n; i++){
			a[i]=sc.nextInt();
			if(x>a[i]){
				p0++;
			}else{
				pn++;
			}
		}
		if(pn>p0){
			System.out.println(p0);
				
			}else{
				System.out.println(pn);

		}
		
		

	}
}
