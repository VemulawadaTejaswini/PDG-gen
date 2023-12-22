import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    StringTokenizer stk = new StringTokenizer(in.readLine());
    String s = stk.nextToken();  
    String abc = "ABC";
    int cnt = 0;
    for(int i=0; i+3<=n; i++){
      if(s.substring(i,i+3).equals(abc))
        cnt++;
    }
    System.out.println(cnt);
  }
}