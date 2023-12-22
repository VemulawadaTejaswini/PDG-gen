import java.util.*;
class Main
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			
			int s1 = s.charAt(0);
			int s2 = s.charAt(1);
			int s3 = s.charAt(2);
			
			int sum = 0;
			
			if(s1!='0'){
				sum++;
			}
			
			if(s2!='0'){
				++sum;
			}
			
			if(s3!='0'){
				sum++;
			}
			System.out.println(sum);
		}
}