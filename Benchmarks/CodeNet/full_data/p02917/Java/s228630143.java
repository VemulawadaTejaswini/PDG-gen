import java.util.Scanner; 

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] B = new int[N - 1];
      
      for (int i = 0; i < B.length; ++i) {
        B[i] = in.nextInt(); 
      } 

      int sum = B[0] + B[B.length - 1];

      for (int i = 1; i < B.length; ++i) {
        sum += Math.min(B[i - 1], B[i]);
      }
      
      System.out.println(sum);
    }
  }
}