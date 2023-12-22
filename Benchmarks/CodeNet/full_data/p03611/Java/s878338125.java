import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n == 1) {
        System.out.println(1);
        return;
      }

      int[] arr = new int[100001];
      for(int i = 0; i < n; i++)
        arr[sc.nextInt()]++;
      
      int max = 0;
      for(int i = 2; i < arr.length - 1; i++) {
          max = Math.max(max, arr[i-1] + arr[i] + arr[i+1]);
      }

      System.out.println(max);
  }
}
