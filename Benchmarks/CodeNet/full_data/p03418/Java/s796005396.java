import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n, k, ind, i, j, count = 0;
      String str;

      str = reader.readLine();
      ind = str.indexOf(" ");
      n = Integer.parseInt(str.substring(0, ind));
      k = Integer.parseInt(str.substring(ind+1));

      for(i = k; i <= n; i++ ){
        for(j = 1; j<= n; j++){
          if(i%j >= k){
            count = ++count;
          }
        }
      }

      System.out.println(count*2 - subcount);
      
    }
    catch (Exception e) {
      
    }
  }
}