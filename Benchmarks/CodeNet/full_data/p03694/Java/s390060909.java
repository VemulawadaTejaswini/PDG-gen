import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++ ){
			a[i] = scan.nextInt();
		}
		
		int length = max(a) - min(a);
		
		System.out.println(length);

	}
	public static int max(int[] a){
		int max=0;
		int kari=0;
		
		for( int hoge : a){
			if(hoge > kari) {
				max =hoge;
				kari = hoge;
			}
		}
		
		return max;
	}
	public static int min(int[] a){
		int min=0;
		int kari=1000;
		
		for( int hoge : a){
			if(hoge < kari){
				min =hoge;
				kari = hoge;
			}
		}
		
		return min;
	}

}