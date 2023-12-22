import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 

    // long[] h = new long[N];
    long[] h = new long[N];
    for (int i=0; i < N ;i++) {
      h[i] =  sc.nextLong();
    }
    for (int i=N-1;i>0;i--) {
      // System.out.println(i);
      if(h[i-1]>h[i]){
        if(h[i-1] - h[i] ==1){
         h[i-1]--; 
        }else{
          System.out.println("No");
          return;
        }
      }

    }
    System.out.println("Yes");
  }
}

