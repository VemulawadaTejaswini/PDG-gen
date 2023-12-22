import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		
		String s1=s.substring(0,1);
		String s2=s.substring(1,2);
		String s3=s.substring(2,3);
		
		String t1=t.substring(0,1);
		String t2=t.substring(1,2);
		String t3=t.substring(2,3);
		
		int result=0;
		
		if(s1.equals(t1)){
			result+=1;
			}
		else{
			result+=0;
		}
		if(s2.equals(t2)){
			result+=1;
		}
		else{
			result+=0;
		}
		if(s3.equals(t3)){
			result+=1;
		}
		else{
			result+=0;
		}
		System.out.println(result);
	}
}