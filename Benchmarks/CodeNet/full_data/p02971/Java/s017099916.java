import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int num[] = new int[N];
    for (int i = 0; i < N; i++) {
      num[i] = sc.nextInt();
    }
    
    int max = 0;
    
    for(int i = 0; i < num.length;i++){
      for(int m = 0; m < num.length ; m ++){
        if(i != m){
          max = Math.max(max, num[m]);
        }

      }
        System.out.println(max);
        max = 0;
    }
  }
}