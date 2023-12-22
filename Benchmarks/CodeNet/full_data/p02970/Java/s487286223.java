import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line = br.readLine().split(" ");
    int n = Integer.parseInt(line[0]);
    int d = Integer.parseInt(line[1]);
    System.out.println(n/(2*d+1) + (n%(2*d+1) == 0 ? 0 : 1));
  }
}
