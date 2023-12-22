import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    int b = 380000;
    double d=0;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int il=Integer.parseInt(in.readLine());
    for(int i=0;i<il;i++) {
      String[] s=in.readLine().split(" ");
      if(s[1].equals("JPY")) {
        d+=Integer.parseInt(s[0]);
      }
      else{
        d+=Double.parseDouble(s[0])*b;
      }
    }
    System.out.println(d);
  }
}