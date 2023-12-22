import java.io.*;
import java.util.*;


public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	String c=s.next();
	boolean flag=false;
	for(int i=0;i<c.length();i++)
	{if(c.charAt(i)=='7')
	{flag=true;
	break;
	}}
	if(flag)
	System.out.println("Yes");
	else
	System.out.println("No");
	}
}