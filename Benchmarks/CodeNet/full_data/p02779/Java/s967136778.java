import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	ArrayList<Integer> nums = new ArrayList<Integer>();
      	int stack;
		boolean neq = true;
      
      	for(int i = 0;i < n && neq;i++){
        	stack = sc.nextInt();
         	if(nums.contains(stack)) neq = false;     	
            nums.add(stack);         
        }        
      	
      	if(neq) System.out.println("YES");
      	else System.out.println("NO");
        
	}
}
