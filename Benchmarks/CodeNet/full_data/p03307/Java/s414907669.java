import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    
    System.out.println(num % 2 == 0 ? num : num*2);
  }
}