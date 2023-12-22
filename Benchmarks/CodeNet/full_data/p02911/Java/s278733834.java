import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int q = scan.nextInt();

    int [] g = new int[n];
    for (int i=0;i<q;i++){
      int t = scan.nextInt();
      g[t-1] += 1;
    }

    for (int j=0;j<n;j++){
      if (k-q+g[j] > 0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}
