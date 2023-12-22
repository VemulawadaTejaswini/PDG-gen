import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
 	int A = sc.nextInt();
 	int B = sc.nextInt();
	int cnt = 0;
  	char[] c = new char[N];
  	while(cnt < N){
      for(int i=0;i<A;i++){
        if(cnt == N) break; 
	    c[cnt++] = 'b';
          
      }
      for(int j=0;j<B;j++){
        if(cnt == N) break; 
        c[cnt++] = 'r';
      }
    }
  	int ans =0 ;
    for(int k=0;k<N;k++){
      if(c[k] == 'b') ans++;
    }
	System.out.print(ans);
	}
}
