import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer = 0;
    int sum = 0;
    
    for(int i=1; i<=n; i++){
      while(i>0){
        sum += i%10;
        i /= 10;
      }
    if(sum>=a && sum<=b)
      answer += sum;
    }
    
    System.out.println(answer);
    
  }
}
