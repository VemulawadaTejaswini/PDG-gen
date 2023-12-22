import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int ans = 0;
    
    for(int i = 0; i<s.length()+1; i++) {
      for(int j = i + 1; j < s.length()+1; j++) {
        String sub = s.substring(i,j);
        int tmpLen = 0;
        for(int k = 0; k < sub.length(); k++) {
          if(sub.charAt(k) == 'A'||sub.charAt(k) == 'C'||
             sub.charAt(k) == 'G'||sub.charAt(k) == 'T') {
            tmpLen++;
          } else {
            break;
          }
        }
        ans = Math.max(ans, tmpLen);
      }
    }
    System.out.println(ans);
  }
}