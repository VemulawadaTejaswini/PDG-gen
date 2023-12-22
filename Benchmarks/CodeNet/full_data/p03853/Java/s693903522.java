import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < H; i++) {
    		String tmp = sc.next();
    		sb.append(tmp + "\n" + tmp + "\n");
    	}
    	System.out.println(sb);
    }
}