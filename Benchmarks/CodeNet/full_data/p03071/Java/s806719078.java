import java.util.*;
import java.lang.*;
import java.io.*;
public class Unique {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

	int a,b;
	a=input.nextInt();
	b=input.nextInt();
	
	int p=Math.max(a*2-1,b*2-1);
	int n=Math.max(p, a+b);
			System.out.println(n);
}
}
