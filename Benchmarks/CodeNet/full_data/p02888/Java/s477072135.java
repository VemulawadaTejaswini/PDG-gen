import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    Integer[] L= new Integer[N];
    for(int i = 0;i<N;i++) L[i]=Integer.parseInt(sc.next());
    int r = 0;
    Arrays.sort(L,Collections.reverseOrder());
    for (int i = 0;i<N-2;i++){
      for(int k = i+1;k<N-1;k++){
        int invm = -1;
        int invs = -1;
        int m = L[i]+L[k];
        int s = L[i]-L[k];
        int Mstart = 0;
        int Sstart = 0;
        if(L[k+(N-k)/2]>=m) Mstart = (N-k)/2;
        if(L[k+(N-k)/2]>s) Sstart = (N-k)/2;
        for(int j = 0;j<(N-k)/2;j++){
          if(invm == -1 && k + Mstart + j + 1 < N && L[k+Mstart+j+1]<m){
            if(L[(k+Mstart+j+1+N)/2]>=m){
              invm = (k+Mstart+j+1+N)/2-1;
            }else{
              invm = k+Mstart+j;
            }
          }
          if(invs ==-1 &&k+Sstart+j+1<N&&L[k+Sstart+j+1]<=s){
            if(L[(k+Mstart+j+1+N)/2]>=m){
              invs=(k+Sstart+j+1+N)/2-1;
            }else{
            invs = k+Sstart+j;
            }
          }
        }
        if(invs == -1) invs = N-1;
        if(invs>invm) r+=invs-invm;
      }
    }
    System.out.println(r);
  }
}