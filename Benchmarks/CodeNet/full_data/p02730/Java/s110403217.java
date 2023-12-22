import java.io.*;

public class Main {

  static boolean checkKaibun(String str){
    StringBuilder t = new StringBuilder(str);
    return (str.equals(t.reverse().toString()));
  }

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();

    br.close();

    int n = s.length();
    boolean ok = checkKaibun(s);
    ok &= checkKaibun(s.substring(0, (n-1)/2));
    ok &= checkKaibun(s.substring((n+1)/2));

    System.out.println(ok ? "Yes" : "No");
    
  }
}