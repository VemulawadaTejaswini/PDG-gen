import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
    }
    int ans = 1;
    int sub = 1;
    for(int i=0; i<N; i++){
      ans *= 3;//abs_max.(A-b) = 3
      if(A[i]%2==0){
        sub *= 2;//Whan even > odd, even(A[i]), odd > then supposed to 2 minus  
      }
    }
    System.out.println(ans-sub);
  }
}
    