import java.io.*;

public class Main {

  static boolean checkKaibun(String str){
    StringBuilder t = new StringBuilder(str);
    return (str.equals(t.reverse().toString()));
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in;
    in = br.readLine().split(" ");
    double l = Double.parseDouble(in[0]);

    br.close();

    System.out.println(String.format("%.10f", (l / 3.0) * (l / 3.0) * (l / 3.0)));
    
  }
}