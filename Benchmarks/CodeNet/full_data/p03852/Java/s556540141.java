import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] vowel = {"a", "i", "u", "e", "o"};
    
    if (Arrays.asList(vowel).contains(str)) {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");
    }
  }
}