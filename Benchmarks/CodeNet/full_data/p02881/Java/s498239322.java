import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
	   long N = sc.nextLong();
      //高橋君の位置
       long i = 1;
       long j = 1;
       long a = 1;
      
      //最終的な位置
      while(a<=N/a){
        if(N%a==0){
          i = a;
          j = N/i;
        }
        a++;
      }
      
      System.out.println(i+j-2);
    }
}