import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void Main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] tri = new int[3];
      tri[0] = scan.nextInt(); 
      tri[1] = scan.nextInt(); 
      tri[2] = scan.nextInt(); 
      
      Arrays.sort(tri);
      System.out.print((tri[0] * tri[1]) /2);
    }
 
}