import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int indexToConvert = Integer.parseInt(line1[1]);
    
    String str = br.readLine();
    char[] chars = str.toCharArray();
    chars[indexToConvert-1] = Character.toLowerCase(chars[indexToConvert-1]);
    
    System.out.println(new String(chars));
  }
}