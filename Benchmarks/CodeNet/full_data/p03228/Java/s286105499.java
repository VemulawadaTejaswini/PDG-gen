import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
 
        // tenka1_2018_b
        int i = 0;
        while (k > 0) {
        	k--;
        	if (i%2 == 0) {
        		// a
        		if (a%2 != 0) {
        			a--;
        		}
        		int half = a / 2;
        		a -= half;
        		b += half;
        	} else {
        		// b
        		if (b%2 != 0) {
        			b--;
        		}
        		int half = b / 2;
        		b -= half;
        		a += half;
        	}
        	i++;
        }
        System.out.println(a + " " + b);
	}
}