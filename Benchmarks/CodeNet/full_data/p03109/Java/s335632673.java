import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    
    String yyyy = s.substring(0,4);
    String mm = s.substring(5,7);
    String dd = s.substring(8,10);
    
    String yyyymmdd = yyyy + mm + dd;
    int ans = Integer.parseInt(yyyymmdd);
    System.out.println(ans<=20190430?"Heisei":"TBD");
  }
}