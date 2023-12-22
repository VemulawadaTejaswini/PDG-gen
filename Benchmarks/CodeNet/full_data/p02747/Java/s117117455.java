import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);	
	String c=s.next();
	int n=c.length();
	boolean flag=true;
	for(int i=0;i<n;i+=2)
	{if(c.substring(i,i+2).equals("hi"))
	{}
	else
	{flag=false;
	break;
	}}
	if(flag)
	System.out.println("Yes");
	else
	System.out.println("No");
	}}