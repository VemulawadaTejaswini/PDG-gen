import java.util.*;
public class Main
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int L[]=new int [M];
        int R[]=new int [M];
        for(int i=0;i<M;i++){
            L[i]=sc.nextInt();
            R[i]=sc.nextInt();
        }
        int left=L[0];
        int right=R[M-1];
        for(int j=0;j<M-1;j++){
            if(L[j]<L[j+1]){
                left=L[j+1];
            }
            if(R[M-1-j]>R[M-1-j-1]){
                right=R[M-1-j-1];
            }
        }
        int result = right-left+1;
      if(result<0){
        result=0;
      }
      if(result>N){
        result=N;
      }
        System.out.println(result);
    }
}