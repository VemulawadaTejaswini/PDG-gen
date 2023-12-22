import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String strs[] = br.readLine().split(" ");
    String s = br.readLine();
    int N = Integer.parseInt(strs[0]), Q = Integer.parseInt(strs[1]);
    int count = 0;
    
    for (int i = 0; i < Q; i++) {
      String[] str = br.readLine().split(" ");
      int start = Integer.parseInt(str[0]), end = Integer.parseInt(str[1]);
      String tmp = s.substring(start-1, end);
      int index = 0;
      while(true){
        if (tmp.indexOf("AC") >= 0) {
          index = tmp.indexOf("AC");
          count++;
          if (index+2 < tmp.length()) {
            tmp = tmp.substring(index+2, tmp.length());
          } else {
            break;
          }
        } else {
          break;
        }
      }
      System.out.println(count);
      count = 0;
    }
  }
}