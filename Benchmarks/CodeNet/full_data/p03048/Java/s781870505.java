import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    int ans = 0;
    int x = N/R;
    int y = N/G;
    int z = N/B;
    
    for(int i=0;i<z+1;i++){
      for(int j=0;j<y+1;j++){
        for(int k=0;k<x+1;k++){
          if(i*B + j*G + k*R == N){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}
