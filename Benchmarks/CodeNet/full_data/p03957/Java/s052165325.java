
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String k=in.next();
		int z=0;
		char[] a=new char[k.length()];
		char[] b=new char[k.length()];
		for(int i=0;i<k.length();i++)
		{
			a=k.toCharArray();
		}
		for(int i=0;i<k.length();i++)
		{
			if(a[i]=='C'||a[i]=='F')
			{
				b[z]=a[i];
				z++;
			}
		}
		for(int i=0;i<z-1;i++)
		{
			if(b[i]=='C'&&b[i+1]=='F')
			{
				System.out.println("Yes");
				break;
			}
			else
				System.out.println("No");
			break;
		}
		in.close();
	}

}
