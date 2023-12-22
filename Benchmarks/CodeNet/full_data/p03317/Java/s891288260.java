import java.util.Arrays;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] A = new int[N+1];
    int one = 0;
    for(int i = 1; i <= N; i++){
      A[i] = scanner.nextInt();
      if(A[i] == 1){
        one = i;
      }
    }
    if((N-1)%(K-1)!=0){
      System.out.println((N-1)/(K-1)+1);
    }else{
      System.out.println((N-1)/(K-1));
    }
  }
}