import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.math.BigInteger;
public class Main
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
       int m=Integer.parseInt(st.nextToken());
if(n+m==15)
  System.out.println("+");
else if(n*m==15)
System.out.println("*");
else
System.out.println("x");
}
}