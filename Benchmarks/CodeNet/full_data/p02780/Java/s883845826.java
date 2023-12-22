import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    float[] arr = new float[N];
    for (int i = 0; i < N; i++) {
        arr[i] = (float)Integer.parseInt(sc.next());
    }
    float max = 0;
    float avg = 0;
    for(int j = 0; j < N+1-K; j++){
      avg = 0;
      for(int k = j; k < j+K; k++){
        avg +=  ((arr[k] + 1) * 0.5);
        
      }
      if(max<avg){
        max = avg;
      }
    }

    System.out.print(max);

}  
}
