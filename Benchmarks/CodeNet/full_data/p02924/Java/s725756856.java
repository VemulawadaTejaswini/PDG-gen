import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] P = new int[N+1]; 
    int[] M = new int[N+1]; 

    int sum=M[N];
    for (int i=1;i<N;i++){
      P[i]= i+1;
      sum+=i;
    }
 
    System.out.println(sum);
  
  }
 
}