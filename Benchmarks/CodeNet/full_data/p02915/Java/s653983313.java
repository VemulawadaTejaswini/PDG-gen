import java.util.Random;

public class Main {
 public static void main (String[] args) {
   Random rand = new Random();
   int N = rand.nextInt(9) + 1;
   System.out.print(N*N*N);
 }
}