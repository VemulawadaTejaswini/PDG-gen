import java.util.Scanner;
  class Main {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[] a = new int[N];
		int y ;
		int total = 0;
		int cost = 0;
		
		//Get data and add total
		for ( int i = 0 ; i < N ; i++ ) {
			a[i] = sc.nextInt();
			total += a[i];
			//System.out.println("現在の合計は" + total +"です。");
		}
		
		for ( int i = 0 ; i < N ; i++ ) {
			y = total / N ;
			//System.out.println("平均は" + y +"です。");
			cost += ( a[i] - y ) * ( a[i] - y );
			//System.out.println("a[" + i + "]番目のコストは、" + (a[i] -y)*(a[i] -y));
			//System.out.println("現在のコストは" + cost +"です。");
		}
		System.out.println(cost);
	}
}