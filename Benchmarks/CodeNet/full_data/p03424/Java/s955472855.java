import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] s = in.readLine().split(" ");
    boolean yellow_flg = false;
    for(int i=0; i<n; i++) {
      if(s[i].charAt(0)=='Y')
        yellow_flg = true;
    }
    System.out.println(yellow_flg == true?"four":"three");
  }
}