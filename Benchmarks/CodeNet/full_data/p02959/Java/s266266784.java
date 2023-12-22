import java.util.Scanner;

public class Main {
	  public static void main(String[] args ) throws Exception {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int[] zoma = new int[N+5];
		int[] hero = new int[N+5];
		
		for(int i= 0;i < N+1 ; i++ ) {
			zoma[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N;i++) {
			hero[i] = sc.nextInt();
		}
		
		int zomastock = 0;
		int herostock = 0;
		
		int mochikosi = 0;
		
		int ans = 0;
		
		for(int i = 0;i < N + 1 ;i++) {
			zomastock = zoma[i];
			herostock = hero[i];
			
			int a = zomastock - (herostock + mochikosi);
			if(a >= 0) {
				ans += herostock + mochikosi;
			}else {
				ans += zomastock;
				a = Math.abs(a);
				mochikosi = a-(zoma[1] + zoma[i+1] );
				if(mochikosi < 0) mochikosi = 0;
			}
		}
		System.out.println(ans);
  }	
}