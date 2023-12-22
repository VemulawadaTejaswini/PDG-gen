
import java.io.*;
import java.util.*;


public class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	long ans=0;
	for(int i=1;i<=n;i++)
	{if(i%3==0 || i%5==0)
	{}
	else
	ans+=i;
	}
	System.out.println(ans);
	}
}