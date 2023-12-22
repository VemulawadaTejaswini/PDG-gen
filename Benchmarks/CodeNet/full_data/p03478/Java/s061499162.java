import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= n; i++){
      int tmp = 0;
      int num = i;
      while(num != 0){
        tmp += num % 10;
        num /= 10;
      }
      if(a <= tmp && tmp <= b){
        sum += i;
      }
    }
    System.out.println(sum);
  }
}