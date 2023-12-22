import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      int[] A = new int[N];
      int rCount = 0;
      int gCount = 0;
      int bCount = 0;
      for(int i=0;i<N;i++){
        A[i] = S.charAt(i);
        if(A[i]=='R'){
          rCount++;
        }else if(A[i]=='G'){
          gCount++;
        }else{
          bCount++;
        }
      }
      long ans = (long)rCount*gCount*bCount;
      for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
          int k = j+j-i;
          if(k<N && A[i]!=A[j] && A[i]!=A[k] && A[j]!=A[k]){
            ans--;
          }
        }
      }      
      System.out.println(ans);
    }
}