import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] R = new int[N];
    for(int i = 0;i<N;i++){
      R[i]=sc.nextInt();
      }
    int r = 0;
    Arrays.sort(R);
    int[] L = new int[N];
    for(int i  = 0;i<N;i++){
      L[i]=R[N-1-i];
    }
    for (int i = 0;i<N-2;i++){
      int invm = 0;
      int invs = 0;
      for(int k = i+1;k<N-1;k++){
        int m = L[i]+L[k];
        int s = L[i]-L[k];
        int start = invm;
        invm = invs = 0;
        for(int j = start;invs == 0&&j<N-k;j++){
          if(invm == 0&&L[k+j]<m){
            invm = k+j;
          }else if(L[k+j]<=s){
            invs = k+j-1;
          }
        }
        if(invs == 0) invs = N-1;
        if(invs>invm) r+=invs-invm;
      }
    }
    System.out.println(r);
  }
}