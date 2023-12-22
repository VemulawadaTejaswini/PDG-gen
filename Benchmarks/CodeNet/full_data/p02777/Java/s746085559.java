import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] words = br.readLine().split(" ");
    String[] numStr = br.readLine().split(" ");
    int[] num = new int[2];
    num[0] = Integer.parseInt(numStr[0]);
    num[1] = Integer.parseInt(numStr[1]);
    
    String took = br.readLine();
    
    if(took.equals(words[0])){
      num[0]--;
    } else{
      num[1]--;
    }
    
    System.out.println(num[0] + " " + num[1]);
  }
}