import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int k[] = new int[m];
		
		for(int i = 0; i < m;i++) {
			int kn = sc.nextInt();
			for(int j =0 ; j < kn; j++) {
				k[i] |= (1 << (sc.nextInt()-1));
			}
		}
		
		int p[] = new int[m];
		for(int i =0 ; i < m; i++) {
			p[i] = sc.nextInt();
		}
		
		int  count=0;
		for(int i = 0; i < 1<<n;i++) {
			boolean flag = true;
			for(int j = 0; j< m;j++) {				
//				System.out.println(m + " " +k[j]+" " + i+ " " +Integer.bitCount((k[j] & i)));
				flag = flag && (p[j] == Integer.bitCount((k[j] & i))%2 );
			}
			if(flag) {
//				System.out.println(i);
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
