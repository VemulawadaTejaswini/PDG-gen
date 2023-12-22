import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(){
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
            String str = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      String[] astr = str.split(" ");
      long n = Long.parseLong(astr[0]);
      long k = Long.parseLong(astr[1]);
      double result = 0;
      for(int i = 1; i <= n; i++){
          long p = 0, a = i;	
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
