import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int [N];
		int count =0;
		for(int i=0;i<N;i++) 
			nums[i]=sc.nextInt();
		
		Main c = new Main();
		
		while(true)
			if( c.isGusu(nums) ==true) 
			{
				for(int k=0;k<N;k++) 	nums[k] /= 2;
				count += 1;
			}
			else break;
		System.out.println(count);
	}
	
	boolean isGusu (int[] a) 
	{
		for(int i=0;i<a.length;i++) 
			if(a[i] %2 != 0)  return false;
		return true;
	}

}
