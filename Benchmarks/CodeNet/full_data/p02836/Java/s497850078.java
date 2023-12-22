import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      //入力
      String S = sc.next();
      int N = S.length();
      
      char[] a =S.toCharArray();
      int count =0;
      
      //違う文字の数を探す
      for(int i =0; i<N/2; i++){
       if(a[i]!=a[N-1-i]){
         count++;
         }
      }
      //出力
       System.out.print(count);
    }
}