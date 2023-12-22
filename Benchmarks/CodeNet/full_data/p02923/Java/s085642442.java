import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      // 取得
	  int N = sc.nextInt();
      int[] H = new int[N];
      int max =0;
      for(int i=0;i<N;i++){
        H[i]= sc.nextInt();
      }
      for(int i=0;i<N;i++){
        int count =0;
        for(int j=i;j<N-1;j++){
          if(H[j]<H[j+1]){
            break;
          }
          count++;
        }
        max=Math.max(max,count);
      }
      System.out.println(max);
    }
}