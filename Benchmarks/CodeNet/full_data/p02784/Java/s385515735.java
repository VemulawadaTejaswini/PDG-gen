import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int H=sc.nextInt();
      int N=sc.nextInt();
      int[] A=new int[N];
      int cnt=0;
      for(int i=0;i<N;i++){
         for(int j=0;j<N;j++){
            if(A[i]+A[j]>=H){
               cnt++;
            }
         }
      }
      if(cnt>0){
         System.out.print("Yes");
      }else{
         System.out.print("No");
      }
   }
}
         
