import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int nums[] = new int[2]; 
      	
      	for(int i = 0;i < 2; i++){
        	nums[i] = sc.nextInt();
        }
      
      	int counts[] = new int[nums[0]];
        for(int i = 0; i < nums[0]; i++) counts[i] = 0;
      
      	for(int i = 0; i < nums[1]*2; i++){
          counts[sc.nextInt()-1]++;
        }
 		
      	for(int count:counts) System.out.println(count);
        
	}
}
