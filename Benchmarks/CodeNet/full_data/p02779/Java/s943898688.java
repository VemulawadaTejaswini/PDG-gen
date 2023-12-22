import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	long nums[] = new long[n];
		boolean neq = true;
      
      	for(int i = 0;i < n && neq;i++){
        	nums[i] = sc.nextInt();
         	for(int j = 0;j < i && neq;j++){
            	if(nums[i] == nums[j]) neq = false;
            }         
        }        
      	
      	if(neq) System.out.println("YES");
      	else System.out.println("NO");
        
	}
}
