import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(final String[] args) {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	if (n == 1) {
    		System.out.println("a");
    	}else if (n == 2) {
    		System.out.println("aa");
    		System.out.println("ab");
    	}else {
    		Set<String> set = new TreeSet<>();
    		for (int i=0;i< (1<<n-1);i++) {
    			StringBuilder sb = new StringBuilder("a");
    			for (int j=0;j<n-1;j++) {
    				if ((i & (1<<j)) != 0) {
    					sb.append('a');
    				}else {
    					sb.append('b');
    				}
    			}
    			set.add(sb.toString());
    		}
    		for (String tString : set) {
    			System.out.println(tString);
    		}
    	}
    	}
    }
