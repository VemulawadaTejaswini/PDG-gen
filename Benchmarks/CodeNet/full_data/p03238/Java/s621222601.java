import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String age = br.readLine();
    
    if ("1".equals(age)) {
      System.out.println("Hello World");
    } else {
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      System.out.println(A + B);
    }
  }
} 