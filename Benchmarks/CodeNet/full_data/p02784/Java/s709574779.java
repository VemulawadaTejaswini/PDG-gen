import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int ans = 0;
    for(int i = 0;i < n;i++){
      a[i] = sc.nextInt();
      ans += a[i];
    }
    if(ans < h){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}