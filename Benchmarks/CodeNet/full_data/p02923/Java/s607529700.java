import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
        int max = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
        	H[i] = sc.nextInt();
        }
      	for(int j = 0; j < N-1; j++){
        	if(H[j] >= H[i+1]){
            	count++;
            }else{
            	if(max < count){
                	max = count;
                }
                count = 0;
            }
          
        }
      	if(max < count){
                max = count;
        }
        System.out.println(max);
	}
 
}