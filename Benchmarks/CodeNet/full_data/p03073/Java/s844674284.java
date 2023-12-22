import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    
    int evenZeroCnt = 0;
    int oddZeroCnt = 0;
    for(int i=0; i<s.length(); i++) {
      if(i%2!=0 && s.charAt(i)=='1')
        evenZeroCnt++;
      else if(i%2==0 && s.charAt(i)=='0')
        evenZeroCnt++;
      
      if(i%2==0 && s.charAt(i)=='1')
        oddZeroCnt++;
      else if(i%2!=0 && s.charAt(i)=='0')
        oddZeroCnt++;
    }
    
    System.out.println(Math.min(evenZeroCnt,oddZeroCnt));
  }
}