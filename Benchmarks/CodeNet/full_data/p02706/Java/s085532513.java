import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int ans = 0;
    for (int i = 0; i < m; i++){
      ans = ans + scan.nextInt();
    }
    if (ans <=n){
      System.out.println(n - ans);
    }else{
      System.out.println(-1);
    }
  }
}
