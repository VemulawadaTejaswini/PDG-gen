import java.util.Arrays;
import java.util.Scanner;


public class main 
{

public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	int n,i,j;
	long sum=0;
	
	
	n=sc.nextInt();
	String[] s=new String[n];
	
	for(i=0;i<n;i++)
	{	
		s[i]=sc.next();
		char[] c = s[i].toCharArray();
		Arrays.sort(c);
		s[i] = new String(c);
	}
	
	for(i=0;i<n-1;i++)
		for(j=i+1;j<n;j++)
		if(s[i].equals(s[j]))
			sum++;
	
	System.out.println(sum);
	}
}
