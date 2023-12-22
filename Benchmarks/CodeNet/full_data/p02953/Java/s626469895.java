import java.util.*;

public class  Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int H[] = new int[N];
    int max = 0;
    
    for(int i=0; i<N; i++){
      H[i]=sc.nextInt();
      
      if(max - H[i] > 1){
        System.out.println("No");
        return;
      }
      
      max = Math.max(max, H[i]);
    }
    
    System.out.println("Yes");
  }
} 
    