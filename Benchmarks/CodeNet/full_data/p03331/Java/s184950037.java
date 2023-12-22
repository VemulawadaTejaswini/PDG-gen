import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = 0;
    int B = 0;
    int min = 100000000;
    int sum = 0;
    
    for(int i = 1; i<=N/2; i++){
      A=i;
      B=N-A;
      
      while(A!=0){
        sum += A%10;
        A /= 10;
      }
      while(B!=0){
        sum += B%10;
        B/=10;
      }
      if(min>sum){
        min = sum;
      }
    }
    
    System.out.println(min);
  }
}
        
    
    
    