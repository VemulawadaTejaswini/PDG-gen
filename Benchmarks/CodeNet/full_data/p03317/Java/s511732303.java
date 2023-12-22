import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int index = -1;
    if(n == k){
      System.out.println(1);
      System.exit(0);
    }
    for(int i = 0; i < n; i++){
      if(sc.nextInt() == 1){
        index = i;
        break;
      }
    }
    int ans = (int)Math.ceil(index/(k-1)) + (int)Math.ceil((n-index)/(k-1));
    System.out.println(ans);
  }
}