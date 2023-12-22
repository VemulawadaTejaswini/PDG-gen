import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A_i[] = new int[N];
		
		for(int i =0; i<N; i++) {
			A_i[i] = sc.nextInt();
		}
		/*
		 * その約数を求めて
		 * 今ある最大値を下回る数が2つ以上あればng
		 * 
		 * 
		 */
		int max = 0;
		for(int i = 0; i<N; i++) {
			int L = 0;
			int R = 0;
			for(int j =0 ; j<i;j++) {
				L = kouyaku(L,A_i[j]);
				}
			for(int j = i+1; j<N; j++) {
				R = kouyaku(R,A_i[j]);
			}
			
			int t = kouyaku(L,R);
			if(t>max) max = t;
			
			
			
		}
		
		System.out.println(max);
		
		
	}
	
	public static int kouyaku(int a, int b) {
		if(a==0)return b;
		if(b == 0)return a;
		if(a==b)return a;
		
		int max =  a>b ? a:b;
		int min =  b>a ? a:b;
		
	 int r = max%min; //あまり
		while(r != 0) {
			max = min;
			min = r; 
			r = max%min;
			
		}
		
		
		return min;
	}
	

}
