import java.util.*;
public class atcoder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		if(isStringLowerCase(s)==true && isStringLowerCase(t)==true)
		{
			int s1=s.length();
			int t1=t.length();
			if(!s.equals(t)==true && (s1<=10||s1>=1) && (t1<=10||t1>=1))	
			{
				Scanner scan=new Scanner(System.in);
				int a=scan.nextInt();
				int b=scan.nextInt();
				if(a<=10 && b<=10)
				{
					String u=sc.nextLine();
					if(u.equals(s)==true || u.equals(t)==true)
					{
						int s2=0,t2=0;
						if(u.equals(s)==true)
						{
							 s2=a-1;
							 System.out.println(s2);
							System.out.println(b);
						}
						if(u.equals(t)==true)
						{
							 t2=b-1;
							 System.out.println(a);
							System.out.println(t2);
						}
					}
				}
			}
		}	


	}






	private static boolean isStringLowerCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in lower case, return false
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        
        return true;
 
    }
}