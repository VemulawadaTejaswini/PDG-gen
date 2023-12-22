import java.util.*;
public class S
{
	Scanner sc=new Scanner(System.in);
  	String s=sc.next();
  	char []ch=s.toCharArray();
  	int c=0;
  	for(int i=0; i<ch.length()-1;i++)
    {
      if(ch[i] != ch[i+1])
        c++;
    }
  System.out.println(c);
}