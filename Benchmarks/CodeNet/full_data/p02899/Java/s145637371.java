import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        int N = sc.nextInt();
		int array[] = new int[N];
      
      for(int i = 0; i < N; i++){
      	array[i] = sc.nextInt();
      }

      String str = "";
      for(int i : array) {
	      str = str + i + " ";
      }
      
      System.out.println(str.trim());
    }
}