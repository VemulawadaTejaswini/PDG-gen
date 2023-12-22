import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
      	int m = sc.nextInt();
      	int sum = 0;
      	int ai = 0;
      	int nd = 0;
      	for(int i = l - 1; i >= 0; i--){
          nd = Math.floor(sum / 10);
          ai = a + b * i;
          sum = sum + ai * Math.pow(10,nd);
        }
		 //出力
		System.out.println(sum%m);
	}
}