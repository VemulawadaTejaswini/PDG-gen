import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int answer =0;
    for(int i=1;i<=N;i++){
      if(isRange(i,A,B)){
        answer = answer+i;
      }
    }
    System.out.println(answer);
  }
  
  public static boolean isRange(int n ,int min ,int max){
    int cnt1=n%10;
    int cnt10=(n/10)%10;
    int cnt100 =(n/100)%10;
    int cnt1000 =(n/1000)%10;
    int cnt10000=n/10000;
    int sums = cnt1+cnt10+cnt100+cnt1000+cnt10000;
    if(min<=sums&&sums<=max){
      return true;
    }
    return false;
  }
  

  
}