import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    long w = Integer.parseInt(data[0]);
    long h = Integer.parseInt(data[1]);
    double x = Integer.parseInt(data[2]);
    double y = Integer.parseInt(data[3]);
    int multipleAns = (x==w/2.0 && y==h/2.0 ? 1 : 0);
    
    System.out.println(w*h/2.0 + " " + multipleAns);
  }
}
