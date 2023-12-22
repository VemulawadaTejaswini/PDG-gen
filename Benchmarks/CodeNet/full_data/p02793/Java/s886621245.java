import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    int MAX=0;
    int ans=0;
    
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    
    MAX=A[0];
    
    for(int i=0;i<N;i++){
      MAX=gcd(MAX,A[i]);
    }

    int[] B=new int[N];
                    
    for(int i=0;i<N;i++){
      B[i]=MAX/A[i];
    }
    
    for(int i=0;i<N;i++){
      ans+=B[i];
    }
    System.out.print(ans);
  }
  
  public static int gcd(int a,int b){
    int answer=1;
    for(int i=a;i>=0;i--){
      if(a%i==0&&b%i==0){
        answer=i;
        break;
      }
    }
    return (a*b)/answer;
  }
    
}