import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		long h = scn.nextLong();
		long w = scn.nextLong();
      	long x = h*w;
      	if(x%2==1) x++;
      	if(h==1 || w==1) x=2;
      	System.out.println(x/2);
	}
}
