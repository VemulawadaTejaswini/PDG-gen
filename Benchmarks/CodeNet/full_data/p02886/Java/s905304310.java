import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] b = new int[a];
    int ans = 0;
    for(int i=0;i<a;i++){
      b[i] = sc.nextInt();
    }
    for(int i=0;i<a;i++){
      for(int j=i+1;j<a;j++){
        ans += b[i] * b[j];
      }
    }
    System.out.println(ans);
  }
}