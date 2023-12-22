import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }
    if(sum == x){
      System.out.println(a.length);
    }
    else if(sum < x){
      System.out.println(a.length - 1);
    }
    else{
    int count = 0;
    Arrays.sort(a);
    for(int i = 0; i < n; i++){
      if(a[i] <= x){
        count++;
        x -= a[i];
      }
    }
    System.out.println(count);
  }
  }
}