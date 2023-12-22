import java.awt.Point;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.omg.PortableInterceptor.INACTIVE;
public class Main {


public static void C(BufferedReader br)throws Exception
{
	String in = br.readLine();
	StringTokenizer st=new StringTokenizer(in);
	int n= Integer.parseInt(st.nextToken());
	boolean a=false;
	boolean b=false;
	boolean c=false;
	int s=0;
	for(int i=0;i<n;i++)
	{
		in=br.readLine();
		st=new StringTokenizer(in);
		int A= Integer.parseInt(st.nextToken());
		int B= Integer.parseInt(st.nextToken());
		int C= Integer.parseInt(st.nextToken());
		int maxAB=Math.max(A, B);
		int maxBC=Math.max(B, C);
		int maxAC=Math.max(A, C);
		int max1=Math.max(maxAB, maxBC);
		int max=Math.max(max1, maxAC);
		if(max==A&& !a)
		{
			s+=A;
			a=true;
			b=false;
			c=false;
		}
		else if(max==A && a)
		{
			if(maxBC==B)
			{
				s+=B;
				b=true;
				a=false;
				c=false;
			}
			else
			{
				s+=C;
				c=true;
				b=false;
				c=false;
			}
		}
		else if(max==B&& !b)
		{
			s+=B;
			b=true;
			a=false;
			c=false;
		}
		else if(max==B && b)
		{
			if(maxAC==A)
			{
				s+=A;
				a=true;
				b=false;
				c=false;
			}
			else
			{
				s+=C;
				c=true;
				a=false;
				b=false;
			}
		}
		else if(max==C&& !c)
		{
			s+=C;
			c=true;
			a=false;
			b=false;	
		}
		else if(max==C && c)
		{
			if(maxAB==A)
			{
				s+=A;
				a=true;
				b=false;
				c=false;
			}
			else
			{
				s+=B;
				b=true;
				a=false;
				c=false;
			}
		}
		if(max==A&&max==B)
		{
			a=false; b=false;
		}
		else if(max==A&&max==C)
		{
			a=false; c=false;
		}
		else if(max==B&&max==C)
		{
			b=false; c=false;
		}
	}
	System.out.println(s);
}
public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	C(br);

	
}
	
}
