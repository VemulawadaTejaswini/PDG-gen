import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long X = sc.nextLong();
		sc.close();

		if(A >= X || B >=X){
			System.out.println(0);
			return;
		}

		//二分探索
		long right = 1000000001;
		long left = 0;
		while(right >= left){
			long mid = (left + right)/2;
			long div = String.valueOf(mid).split("").length;
			if(A * mid + B * div <= X){
				left = mid;
			}else{
				right = mid;
			}
		}
		System.out.println(left);
	}
}