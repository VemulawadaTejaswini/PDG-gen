import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
	   int N = sc.nextInt();
       int i = 1;
       int j = 1;
       int a = 1;
  
      //最終的な位置
      while(i<=N){
        if(N%i==0){
          j = N/i;
        }
        i++;
      }
      
      System.out.println(i+j-2);
    }
}