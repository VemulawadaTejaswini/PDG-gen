import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
      	long x = scn.nextLong();
      	int count = 0;
      	long aa = a/x;
      	long bb = b/x;
      	for(long i=a; i<=b; i++){
          if(i%x==0) count++;
        }
      	System.out.println(bb-aa+1);
	}
}
