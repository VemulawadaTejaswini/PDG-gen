import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i=i+2){
			int tmp = 0;
			for(int j = 1; j <= i; j++){
				if(i%j==0)tmp++;
				if(tmp==9)break;
			}
			if(tmp == 8)ans++;
		}
		System.out.print(ans);
	}
}
