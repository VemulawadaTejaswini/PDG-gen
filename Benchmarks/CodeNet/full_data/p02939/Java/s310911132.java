import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();

    List<String> wordPattern = new ArrayList<String>();
    // 文字を読み込んでいく

    char curr = S.charAt(0);
    int cnt = 0;
    int s = 0;

    for (int i = 0; i < S.length(); i++){

      if(s != S.charAt(i) || i == 0){
        s = S.charAt(i);
        cnt++;
      } else if(++i < S.length()){
        s = 0;
        cnt++;
      }

    }

    System.out.println(cnt);

  }
}
