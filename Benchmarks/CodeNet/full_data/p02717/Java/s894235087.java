import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int x=s.nextInt();
	    int y=s.nextInt();
	    int z=s.nextInt();
	    
	    int t=y;
	    y=x;
	    x=z;
	    z=t;
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(z);
	}
}
