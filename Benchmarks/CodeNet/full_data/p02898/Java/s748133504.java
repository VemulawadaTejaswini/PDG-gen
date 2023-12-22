import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int[] height = new int[n];
      for (int i = 0; i < n; i++) {
      	height[i] = scanner.nextInt();
      }
      
      int count = 0;
      for (int j = 0; j < height.length; j++) {
      	if (height[j] >= k) count++;
      }
      System.out.println(count);
    }
}
