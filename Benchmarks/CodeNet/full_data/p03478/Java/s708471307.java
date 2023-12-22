import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=N;i++){
      if(sumDigits(i)<=B && sumDigits(i) >= A){
        sum += i;
      }
    }
    System.out.println(sum);
  }

  public static int sumDigits(int n){
    int sum = 0;
    while(n > 0){
      sum += n%10;
      n /= 10;
    }
    return sum;
  }

}
