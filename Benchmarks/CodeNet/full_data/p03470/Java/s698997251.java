import java.util.*;

public class Main{
  	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();			//N
 		int[] A = new int[N];
      	int num = 0;
      	for(int i=0;i<N;i++){
          int j = 0;
          int k = sc.nextInt();
          while(j<num&&A[j]!=k){
            j++;
          }
          if(j>=num){
            A[j]=k;
            num++;
          }
        }
      System.out.println(num);
    }
}