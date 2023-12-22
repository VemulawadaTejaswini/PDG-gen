import java.util.*;

public class Main {
    public static int ABS(int a){
        return (a>0)?a:-a;
    }
    
    public static int shellsort(int[] X,int N){
    int count=0;
    int h;
    for(h=1;h<N/9;h=3*h+1){
      ;
    }
    
    for(;h>0;h/=3){
      for(int i=h;i<N;i++){
        int j;
        int tmp=X[i];
        for(j=i-h;j>=0&&tmp<X[j];j-=h){
          X[j+h]=X[j];
          count++;
        }
        X[j+h]=tmp;
        count++;
      }
    }
    return count;
  }
  
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int MINUS;
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt()-i;
        }
        
        int S=shellsort(A,N);
        
        if(N%2==1){
            int CENTER=(N+1)/2;
            MINUS=A[CENTER];
        }else{
            int CENTER=(N+1)/2;
            MINUS=A[CENTER];
        }
        
        Long ANS=0L;
        
        for(int i=0;i<N;i++){
            ANS+=ABS(A[i]-MINUS);
        } 
      
        System.out.println(ANS);
    }
}
