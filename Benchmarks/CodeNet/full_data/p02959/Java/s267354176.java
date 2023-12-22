import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N+1];	// i町の敵の数
    int[] b = new int[N];	// 各勇者の倒せる敵の数
    
    for(int i=0; i<N+1; i++){
      a[i] = sc.nextInt();
    }
    
    for(int i=0; i<N; i++){
      b[i] = sc.nextInt();
    }
    
    int ans = 0;
    for(int i=0; i<N; i++){
	  if(a[i]<b[i]){
	  ans+=a[i];
		if(a[i+1]<b[i]-a[i]){
		  ans+=a[i+1];
		  a[i+1]=0;
		}else{
		  ans+=b[i]-a[i];
		  a[i+1]-=b[i]-a[i];
	    }
	  }else{
		ans+=b[i];
      }
    }
	
    System.out.println(ans);
		
  }
}