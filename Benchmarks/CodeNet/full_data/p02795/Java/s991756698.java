import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int h = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    int w = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    br.close();

    if(h < w){
      int t = h;
      h = w;
      w = t;
    }

    System.out.println((n-1)/ h + 1);
  }
}