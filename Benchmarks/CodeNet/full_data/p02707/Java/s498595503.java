import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    for(int i = 2;i<n+1;i++){
      int ty = sc.nextInt();
      a[ty]++;
    }
    for(int i = 1;i<n+1;i++){
      System.out.println(a[i]);
    }
  }
}
