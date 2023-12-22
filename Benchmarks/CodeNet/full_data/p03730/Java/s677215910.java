import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 整数の取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      for(int i=1;i<=B;i++){
          if((A*i)%B==C){
            System.out.println("Yes");
            return;
          }
      }
      System.out.println("No");
    }
}