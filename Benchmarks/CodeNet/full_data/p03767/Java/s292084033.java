import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n*3];
      for(int i = 0; i < n * 3; i++)
        arr[i] = sc.nextInt();

      Arrays.sort(arr);
      long sum = 0;
      for(int i = n * 3 - 2, t = 0; i >= 0 && t < n; i-=2, t++)
        sum = sum + arr[i];
      System.out.println(sum);
  }
}