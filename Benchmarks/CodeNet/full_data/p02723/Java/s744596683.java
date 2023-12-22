
import java.util.Scanner;
class Test
{
 	public static void main(String arg[])
    {
     	String s=new Scanner(System.in).next();
        char ch[]=s.toCharArray();
      
          	if(ch[2]==ch[3]&&ch[4]==ch[5])
              System.out.println("Yes");
          	else
              System.out.println("no");
        
    }
}
