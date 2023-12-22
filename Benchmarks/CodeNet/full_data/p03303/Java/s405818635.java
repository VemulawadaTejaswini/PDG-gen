import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.math.BigInteger;
public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       String s=st.nextToken();
st = new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
String s1="";
s1+=s.charAt(0);
for(int i=0;i<s.length();i++)
{
	if(i+n<s.length())
	{
	   s1+=s.charAt(i+n);
	   i=i+n-1;
	}
}
System.out.println(s1);
}
}