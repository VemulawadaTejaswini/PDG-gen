import java.util.*;

class Main{
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int N = sc.nextInt();
      int[] L=new int[N];
	  for(int i=0;i<N;i++){
      L[i]+=sc.nextInt();
      }	
      Arrays.sort(L);
      int Ls=0;
      for(int i=0;i<N-1;i++){
      Ls+=L[i];
      }
      if(Ls>L[N-1]){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
      
    }
}