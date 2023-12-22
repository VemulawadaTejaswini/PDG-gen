import java.util.Scanner;
public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int X=sc.nextInt();
      int L[]=new Int[N];
      int D[]=new Int[N+1];
      D[0]=0;
      int m=1;
      for(int i=0;i<N;i++){
      L[i]=sc.nextInt();
      }
      for(int s=1;s<N;s++){
      D[s]=D[s-1]+L[s-1];
        if(D[s]<=X){
        m++;
        }
      }
      
      
    }
}