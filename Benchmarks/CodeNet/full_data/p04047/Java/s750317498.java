import java.util.*;
public class Main{
	public static void main(){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int[] L=new int[n*2];
      for(int i=0;i<L.length;i++){
        L[i]=sc.nextInt();
      }
      sort(L);
      for(int i=0;i<L.length;i+=2){
        sum+=L[i];
		}
      System.out.println(sum);
    }
}