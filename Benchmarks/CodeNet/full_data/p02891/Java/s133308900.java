import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {
 
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		
		String s=sc.next();
		int k=sc.nextInt();
		
		
		
		int cnt=0;
		
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
				cnt++;
		}
		
		
		int cnt2=1;
		
	for(int i=s.length()-1;i>0;i--)	
	{
		if(s.charAt(i)==s.charAt(i-1))
			cnt2++;
		else break;
		
		
	}
		
		int ans=cnt *k;
		if((cnt2)%2 !=0)
		ans++;
		
		
		System.out.println(ans);
		
		
		
		
		
		
		
		
	}
}