import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  // スペース区切りの整数の入力
	  int N= sc.nextInt();
      int K=sc.nextInt();
      int X=sc.nextInt();
      int Y=sc.nextInt();
	  int Sum=0;
		// 出力
      if (N>=K){
      Sum=K*X+(N-K)*Y;
      }else{
      Sum=N*X;
      }
      System.out.println(Sum);
   }
}
