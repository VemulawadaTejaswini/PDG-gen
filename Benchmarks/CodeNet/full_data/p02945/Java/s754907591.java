import java.util.*;

class Abc137 {

	public static void main(String[] args) {
		//scannerオブジェクトの生成
		Scanner sc = new Scanner(System.in);
		
		//変数の定義
		int a = sc.nextInt();
		int b = sc.nextInt();
				
		int sum = a + b;
		int dif = a - b;
		int pro = a * b;
		
		int[] data = {sum, dif, pro};
		int w;
		
		for ( int i = 0; i < data.length - 1; i++ ) {
	        for ( int j = data.length - 1; j > i; j-- ) {
	            if ( data[j - 1] > data[j] ) {
	                w = data[j - 1];
	                data[j - 1] = data[j];
	                data[j] = w;
	            }
	        }
	    }
		
		System.out.print(data[data.length - 1]);
	}
}