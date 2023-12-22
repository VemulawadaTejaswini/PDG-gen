import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();

    List<String> wordPattern = new ArrayList<String>();
    // 文字を読み込んでいく

    StringBuilder sb = new StringBuilder();
    Integer currentIndex = 0;
    while(S.length() > currentIndex){

      sb.append(S.charAt(currentIndex));
      if( !wordPattern.contains(sb.toString()) ){
        wordPattern.add(sb.toString());
        sb.setLength(0);
      }

      currentIndex++;
    }

    System.out.println(wordPattern.size());

  }
}
