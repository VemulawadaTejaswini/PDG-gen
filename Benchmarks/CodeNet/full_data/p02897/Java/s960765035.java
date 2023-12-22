import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        int a = sc.nextInt();
      
      //判定
      if((a%2)==0){
        System.out.println((2/a)/a);
      } else {
        System.out.println(Math.ceil((2/a))/a);
      }
        
    }
}


