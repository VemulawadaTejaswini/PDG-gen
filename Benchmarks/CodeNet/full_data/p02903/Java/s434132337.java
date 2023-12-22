import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < h; i++) {
        	for(int j = 0; j < w; j++) {
    			System.out.print(i<b^j<a ? "1" : "0");
        	}
        	System.out.println();
        }
    }
}
