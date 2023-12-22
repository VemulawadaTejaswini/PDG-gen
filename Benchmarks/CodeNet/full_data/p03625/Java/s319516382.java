import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_71 {

	public static void main(String[] args) {
		ArrayList<Long> nums = new ArrayList<Long>();
		Scanner sc 	   = new Scanner(System.in);
		long N = sc.nextInt();
		long height=0,width=0;
		for(int i=0;i<N;i++) 
		{
			long a = sc.nextInt();
			nums.add(a);
		}
		Collections.sort(nums);
		Collections.reverse(nums);
		
		for(int i=1;i<nums.size();i++) 
		{
			long a = nums.get(i-1);
			long b = nums.get( i );
			if(a==b) 
			{
				 if		(height == 0)  height	 =	a;
				 else if(height != 0) { width	 =	a; break; }
				 nums.remove(i);nums.remove(i-1);i--;
			}
		}
		 System.out.println(height * width);
		
	}

}
