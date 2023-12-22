import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        int N = sc.nextInt();

      String str = "";
      for(int i = 0; i < N; i++){
      	str += sc.nextInt() + " ";
      }
      
      System.out.println(str.trim());
    }
}