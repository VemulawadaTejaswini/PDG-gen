import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long n = Long.parseLong(sc.next());
    long k = Long.parseLong(sc.next());
    long min = n % k;
    long a = k - min;  
      if(min > a)
        min = a;	
	System.out.println(min);
	}
}