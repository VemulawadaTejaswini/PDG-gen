import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int H=sc.nextInt();
      int N=sc.nextInt();
      int[] A=new int[N];
      int damage=0;
      for(int i=0;i<N;i++){
         A[i]=sc.nextInt();
         damage+=A[i];
      }
      if(damage>=H){
         System.out.print("yes");
      }else{
         System.out.print("No");
      }
   }
}
         
