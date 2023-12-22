import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");

    br.close();

    System.out.println(in[2] + " " + in[0] + " " + in[1]);
  }
}