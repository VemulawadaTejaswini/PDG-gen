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
    int cnt = 0;
    String s_rep = s.replace("ABC","a");

    for (int i = 0; i < s_rep.length(); i++){
      if(s_rep.charAt(i) == 'a')
        cnt++;
    }
    System.out.println(cnt);
  }
}