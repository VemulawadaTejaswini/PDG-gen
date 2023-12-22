import java.io.*;

public class Main {
  public static void main(String[] args) {
    BufferedReader kbd =
      new BufferedReader(new InputStreamReader(System.in));
    
    int A = kdb.readLine();
    int B = kbd.readLine();
    int C = kbd.readLine();
    int X = kbd.readLine();
    int count = 0;
    int a;
    int b;
    int c;
    int total;
    
    for (a = 0; a <= A; a++) {
      for (b = 0; b <= B; b++) {
        for (c = 0; c <= c; c++) {
          total = 500*a + 100*b + 50*c;
          if (total == X) count++;
        }
      }
    }
    System.out.println(count);
  }
}