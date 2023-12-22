import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long X = sc.nextLong();
    	long Y = sc.nextLong();
    	int index = 0;
    	while (X <= Y) {
    		X *= 2;
    		index++;
    	}
    	System.out.println(index);
    }
}