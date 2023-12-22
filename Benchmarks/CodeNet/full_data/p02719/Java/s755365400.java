
import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception{
    	
       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	String str[] = br.readLine().trim().split("\\s+");
       	BigInteger b1 = new BigInteger(str[0]);
       	BigInteger b2 = new BigInteger(str[1]);
       	if(b1.compareTo(b2) == 0)
       	{
       		System.out.println(0);
       	}
       	else if(b1.compareTo(b2) < 0)
       	{
       		BigInteger b3 = b1.mod(b2);
       		BigInteger b4 = b1.subtract(b2).abs();
       		b4 = b4.min(b3);
       		System.out.println(b4);
       	}
       	else
       	{
       		BigInteger b3 = b1.mod(b2);
       		BigInteger b4 = b3.subtract(b2).abs();
       		b3 = b3.min(b4);
       		System.out.println(b3);
       	}
    }
}