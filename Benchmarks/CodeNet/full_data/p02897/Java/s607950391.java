import java.util.*;

public class Main{
	public static void main(String args[]){
		
        Scanner sc = new Scanner(System.in);
        
      // 整数の取得
        double a = sc.nextInt();
      	double i = 0;
      
      //判定
      if((a%2)==0){
        i = (a/2)/a;
      } else {
        i = Math.ceil(a/2);
      }
        
      System.out.println(i);
    }
}




