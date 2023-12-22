
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

 //   Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int k = cin.nextInt();
    int[] height = new int[n];

    for (int i=0;i<n;i++) {
      height[i] = cin.nextInt();
    }
    Arrays.sort(height);
    int diff = Integer.MAX_VALUE;
    for (int i=k-1;i<n;i++) {
      int min = height[i-(k-1)];
      int max = height[i];
      int diffTemp = max - min;
      if (diffTemp < diff) {
        diff = diffTemp;
      }
    }

    System.out.println(diff);

  }

}