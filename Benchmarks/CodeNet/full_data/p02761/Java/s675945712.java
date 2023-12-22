import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] s = new int[M];
    int[] c = new int[M];
    
    for(int i=0;i<M;i++){
      s[i] = sc.nextInt();
      c[i] = sc.nestInt();
    }
    
    int[] a = new int[N];
    for(int i=0;i<N;i++){
      a[i] = -1;
    }
    
    for(int i=0;i<M;i++){
      if(a[s[i]] == -1){
        a[s[i]] = a[c[i]];
      }
      else{
        print(-1);
        return;
      }
      
      if(a[N]== -1){
      	print(-1);
        return;
      }
      
      int ans = 0;
      for(int i=0;i<N;i++){
      	ans += a[i] * Math.pow(10,i);
      }
      
      print(ans);
      return;
      
    }
  }
    
    
}