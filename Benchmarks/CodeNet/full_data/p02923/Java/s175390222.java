import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int[] H = new int[N];
      for(int i=0;i<N;i++){
        H[i]= sc.nextInt();
      }
      int max =0;
      int count = 0;
      for(int i=0;i<N-1;i++){
        if(H[i]>=H[i+1]){
          count++;
        }else{
          count =0;
        }
        max = Math.max(max,count);
      }
       System.out.println(max);
    }
}