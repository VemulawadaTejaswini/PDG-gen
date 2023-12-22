import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int total = 0;
    for (int p = 1; p < n; p++){
      int sums = ans(p);
      if((sums>=a)&&(sums<=b)){
        total += sums;
      }
    }
    System.out.println(total);
  }
  public static int ans(int i){
    int sums = 0;
    while(i != 0){
      sums += i%10;
      i = i/10;
    }
    return sums;
  }
}
