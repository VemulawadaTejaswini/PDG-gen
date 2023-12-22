import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	String[] pic = new String[H+2];
    	for (int i = 0; i < H+2; i++) {
    		for (int j = 0; j < W+2; j++) {
    			if (i == 0 || i == H+1) {
    				pic[i] += "#";
    			} else {
    				if (j == 0 || j == W+1) {
    					pic[i] += "#";
    				}
    				pic[i] += sc.next();
    			}
    		}
    	}
    	for (String s : pic) {
    		System.out.println(s);
    	}
    	
    }
}