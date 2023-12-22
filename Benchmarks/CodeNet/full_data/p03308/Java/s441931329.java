import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] A = new int[N];
    
    for(int i=0; i<N-1;i++){
      
      A[i]=sc.nextInt();
    }
    
    Arrays.sort(A);
    
    int diff = abs(A[N-1]-A[0]);
    
    System.out.println(diff);
  }
}
