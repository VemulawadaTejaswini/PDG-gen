import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] num = new int[N];
    
    for(int i=0; i<N;i++){
      num[i] = sc.nextInt();
    }
    
    Arrays.sort(num);
    int output = 0;
    
    for(int i=0; i <= K; i++){
      output += num[N-1-i];
    }
    
    System.out.println(output);
  }
}

