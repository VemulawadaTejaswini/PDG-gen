import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    double a = Integer.parseInt(data[0]);
    double b = Integer.parseInt(data[1]);
    double h = Integer.parseInt(data[2]);
    double x = h/a/a;
    
    double result;
    if (x >= b/2.0){
      double bMinus = 2*(b-x);
      result = 90 - Math.atan(a/bMinus) * 180.0 / Math.PI;
    } else {
      double aDash = 2*a*x/b;
      result = Math.atan(b/aDash) * 180.0 / Math.PI;
    }
    System.out.println(result);
  }
}
