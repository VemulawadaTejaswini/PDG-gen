import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      long n = Integer.parseint(sc.next());
      long total = 0;
      for(long i=0; i<n; i++){
        if(n / 3 == 0 || n / 5== 0 ){
        }else{
          total += n;
        }
      }
      System.out.println(total);   
    }
    
}
