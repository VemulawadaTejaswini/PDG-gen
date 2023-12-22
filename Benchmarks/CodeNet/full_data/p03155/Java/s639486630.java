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

public static void A(BufferedReader br)throws Exception
{
	String in= br.readLine();
	StringTokenizer st= new StringTokenizer(in);
	int n= Integer.parseInt(st.nextToken());
	in=br.readLine();
	st=new StringTokenizer(in);
	int h= Integer.parseInt(st.nextToken());
	in=br.readLine();
	st=new StringTokenizer(in);
	int w= Integer.parseInt(st.nextToken());
	int c=0;
	if(h==n)
	{
		System.out.println(n-w+1);
		return;
	}
	else if(w==n)
	{
		System.out.println(n-h+1);
		return;
	}
	else if(h>n||w>n)
	{
		System.out.println(0);
		return;
	}
	else
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+w)<=n && (j+h)<=n)
				{
					c++;
				}
				else
				{
					//System.out.println("sorry   "+(i+h)+"  "+(j+w));
					break;
				}
			}
		}
		System.out.println(c);
		return;
	}
}

public static void main(String[]args) throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	A(br);

	
}
	
}
