import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long o=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        long[] x=new long[n];
        boolean[] id=new boolean[n];
      for(int i=0;i<m;i++){
        int s=sc.nextInt()-1;
        int c=sc.nextInt();
      	if(id[s]&&x[s]!=c){
          o=-1;
          break;
        }else{
          id[s]=true;
          x[s]=c;  
        }                
      }
      if(n>1&&id[0]&&x[0]==0)o=-1;
      if(o>=0){
        for(int i=0;i<n;i++){
              o*=10;
              if(id[i]){
                  o+=x[i];
              }else if(i==0){
                  o++;
              }
          }
      }
      System.out.println(o);
    }
    
}