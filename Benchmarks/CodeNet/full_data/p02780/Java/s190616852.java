import java.util.*;

class Main{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.imn);
   int N=sc.nextInt();
   int K=sc.nextInt();
    
   int[] saikoro=new int[N+1]; //imosをとって、そこから区間和が最大になるところを見つける
   Arrays.fill(saikoro,0);
   int max=0;		//区間和の最大値をメモする
   for(int i=0; i<N; i++){
     saikoro[i+1]=sc.nextInt();
   }
   for(int i=1; i<=N; i++){
     saikoro[i]=saikoro[i]+saikoro[i-1];	//imos
   }
    max=saikoro[K];
    for(int i=1; i<=N-K+1; i++){
      max=Math.max(max,saikoro[i+K]-saikoro[i]);
    }
    System.out.println((double)(max+K)/2);
  }
}
