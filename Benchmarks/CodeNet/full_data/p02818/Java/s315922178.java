import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A=sc.nextInt();
      int B=sc.nextInt();
      int K=sc.nextInt();
      int cnt=1;
      for(int i=1;i<=K;i++){
         if(A>=1){
            A--;
         }else if(B>=1){
            B--;
         }
      }
      System.out.print(A);
      System.out.print(B);
   }
}
