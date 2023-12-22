import java.io.*;
class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input[] = ((br.readLine()).trim()).split("\\s+");
    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);
    if(a >= 1 && a <= 9 && b >= 1 && b <= 9) {
      System.out.println(a * b);
    }
    else {
      System.out.println(-1);
    }
  }
}