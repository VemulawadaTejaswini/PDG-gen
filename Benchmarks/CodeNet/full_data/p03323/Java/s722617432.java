import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);
    
    System.out.print((A <= 8 && B <= 8) ? "Yay!" : ":(");
  }
}     
