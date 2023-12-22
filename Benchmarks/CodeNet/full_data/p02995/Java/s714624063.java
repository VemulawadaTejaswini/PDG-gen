import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long a = Long.parseLong(sc.next());
	long b = Long.parseLong(sc.next());
	long c = Long.parseLong(sc.next());
	long d = Long.parseLong(sc.next());
	long s=0;
	
	
	if(c!=d){
		long x = b/c - (a-1)/c;   
		long y = b/d - (a-1)/d;
		long w = b/(c*d) - (a-1)/(c*d);
		s = b-a+1-x-y+w;
	}else{
		long x = b/c - (a-1)/c;
		s = b-a+1-x;
	}	
	
	
	System.out.println(s);
}
}
