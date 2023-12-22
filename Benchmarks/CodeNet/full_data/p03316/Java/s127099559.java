import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int s = sumDigits(N);
    if(N %s == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  public static int sumDigits(int n){
    int sum = 0;
    while(n!=0){
      sum += n %10;
      n /= 10;
    }
    return sum;
  }
}
