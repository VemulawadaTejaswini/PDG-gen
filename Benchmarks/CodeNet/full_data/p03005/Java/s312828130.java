import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// ボールの数
		int N = sc.nextInt();
		// 人数
		int K = sc.nextInt();

		int rem = N - K;
      if(K != 1){
      	System.out.println(0);
      }
      else{
        System.out.println(rem);
      }
	}
}