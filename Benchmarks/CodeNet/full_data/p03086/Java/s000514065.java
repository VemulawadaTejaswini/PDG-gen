import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = s.length();
    int max = 0;
    int count = 0;
    
    for(int i=0; i<n; i++) {
      String str = s.substring(i,i+1);
      if(str.equals("A") || str.equals("C") || str.equals("G") || str.equals("T")){
        count++;
        if(max < count){
          max = count;
        } 
      } else {
        count = 0;
      }
    }
    System.out.println(max);
  }
}