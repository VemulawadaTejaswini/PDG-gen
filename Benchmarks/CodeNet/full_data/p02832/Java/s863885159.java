import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      int nextNum = 1;
      for(int i = 0; i < n; i++) {
        if(arr[i] == nextNum)
          nextNum++;
      }
      System.out.println(nextNum == 1 ? -1 : n - nextNum + 1);
  }
}