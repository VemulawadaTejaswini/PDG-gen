import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    long H[] = new long[N]; 
    for(int i=0; i<N; i++){
      H[i] = sc.nextInt();
    }
    Arrays.sort(H);
    
    long num = 0;
    if(K >= N){
      System.out.println(0);
    }
    else{
      for(int i=0; i< N-K; i++){
        num += H[i];
      }
      System.out.println(num);
    }
    
  }
}