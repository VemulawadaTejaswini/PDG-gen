import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int T=sc.nextInt();
    int[] t=new int[N];
    int ans = T;
    
    for(int i=0;i<N;i++){
      t[i]=sc.nextInt();
    }
 
    for(int j=1;j<N;j++){
      if(T <(t[j] - t[j-1])){
        ans += t[j] - t[j-1];
      }else{
        ans += T;
      }
      
    }

    System.out.println(ans);
  }
}