import java.util.Scanner;
public class Main{
  public static void main(){
    　Scanner scan = new Scanner(System.in);
   	　String str1 = scan.next();
      String str2 = scan.next();
      long n = Long.parseLong(str1);
      long k = Long.parseLong(str2);
      double result = 0;
      for(int i = 1; i <= n; i++){
          long p = 0, a = n;	
          while(a < k){
              a = a * 2;
              p++;
          }
          double tmp = 0.5;
          for(long j = 1; j < p; j++){
              tmp = tmp * 0.5 ;
          }
          result = result + tmp;
      }
      result = result / (double)3.0;
      System.out.print(result);
  }
}
