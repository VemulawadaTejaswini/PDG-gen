import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int N,M,s,o,tmp,ans;
    int[] A,B;

    N=sc.nextInt();
    M=sc.nextInt();

    for(s=0;s<N;s++){
      A[s]=sc.nextInt();
      B[s]=sc.nextInt();
    }

    for(s=0;s<N-1;s++){
      for(o=s+1;o<N;o++){
        if(A[s]>A[o]){
          tmp=A[s];
          A[s]=A[o];
          A[o]=tmp;
          tmp=B[s];
          B[s]=B[o];
          B[o]=tmp;
        }
      }
    }

    for(s=0,ans=0;s<N||M==0;s++){
      if(M>B[s]){
        ans=ans+A[s]*B[s];
        M-=B[s];
      }else{
        ans=ans+A[s]*M;
        break;
      }
    }

    System.out.println(ans);
  }
}
