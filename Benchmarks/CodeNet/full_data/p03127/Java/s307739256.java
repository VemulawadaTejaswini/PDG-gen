import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = sc.nextInt();
    for(int i = 1; i < n; i++){
      tmp = f(tmp, sc.nextInt());
    }
    System.out.println(tmp);
  }
  
  public static int f(int a, int b){
    int big = Math.max(a,b);
    int small = Math.min(a,b);
    while(big % small != 0){
      big = big % small;
      int tmp = small;
      small = big;
      big = tmp;
    }
    return small;
  }
}
