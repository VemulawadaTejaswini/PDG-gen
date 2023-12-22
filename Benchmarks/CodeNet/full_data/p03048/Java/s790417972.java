import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    int ans = 0;
    
    for(int i=0;i<B;i++){
      for(int j=0;j<G;j++){
        for(int k=0;k<B;k++){
          if(i+j+k==N){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}