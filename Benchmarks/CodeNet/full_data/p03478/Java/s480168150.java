import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int sum = 0;
    for(int i=1; i<=N; i++){
      int n = i;
      int digitSum =0;
      while(n>0){
        digitSum += n%10;
        n /= 10;
      }
      
      if(digitSum>=A && digitSum<=B){
        sum+=i;
      }
    }
    System.out.println(sum);
  }
}