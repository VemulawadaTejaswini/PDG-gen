import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int C = sc.nextInt();
      int[] B = new int[M];
      for(int x=0;x<M;x++){
    	  B[x] = sc.nextInt();
      }
      int[] A = new int[M];
      int total;
      int count = 0;
      for(int y=0;y<N;y++){
    	total = 0;
    	for(int z=0;z<M;z++){
    		A[z] = sc.nextInt();
    		total = total + A[z]*B[z];
    	}
    	total = total + C;
    	if(0<total){
    		count++;
    	}
      }
      System.out.println(count);
    }
}