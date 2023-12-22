import java.util.Arrays;
import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] data = new String[n];
		
		for(int i= 0;i < n;i++){
			data[i] = sc.next();
		}
		Arrays.sort(data);
		String ans = "";
		for(int i = 0;i < n;i++){
			ans += data[i];
		}
		System.out.println(ans);
		
	}
}