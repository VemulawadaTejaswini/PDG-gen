import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for(int i = 0; i < N; i++){
          n[i] = sc.nextInt();
        }
      
        int kisuu = 1;
        for(int i = 0; i < N; i++){
          int temp = 0;
          if((n[i]-1)%2 != 0){
            temp++;
          }
          if(n[i]%2 != 0){
            temp++;
          }
          if((n[i]+1)%2 != 0){
            temp++;
          }
          kisuu *= temp;
          
        }
      
       System.out.println((int)Math.pow(3,N)-kisuu);
	}
}