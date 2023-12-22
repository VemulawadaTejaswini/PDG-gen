import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int H=sc.nextInt();
      int N=sc.nextInt();
      int A;
      for(int i=0;i<N;i++){
         A=sc.nextInt();
         H-=A;
      }
      if(H<=0){
         System.out.print("yes");
      }else{
         System.out.print("No");
      }
   }
}
         
