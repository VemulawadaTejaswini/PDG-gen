import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      // 整数の取得
	  int N = sc.nextInt();
      int count = 1;
      
      for(int i=0;i<3;i++){
        count = count*N;
      }
      System.out.println(count);
    }
}