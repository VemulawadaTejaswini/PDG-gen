import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int N= sc.nextInt();
		int Sum=0;
		// 出力
       for (int i=1;i<=N;i++){
         Sum+=i;
       }
       System.out.println(Sum);
   }
}
