import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int count = sc.nextInt();

    	int ans = 0;
    	boolean af = false;
    	for (int i = 1; i <= count; i++) {
    		int element = sc.nextInt();
    		if (af && i == element) {
    			ans++;
    			af = false;
    		} else if (i == element) {
    			af = true;
    		} else if (af && i != element) {
    			ans++;
    		}
    	}
    	System.out.println(ans);
    }

}