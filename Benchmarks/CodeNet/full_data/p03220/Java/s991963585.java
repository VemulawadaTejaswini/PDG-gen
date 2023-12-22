import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int t = sc.nextInt();
    	int a = sc.nextInt();
    	int result = 0;
    	int x = 0;

    	for(int i = 1; i <= n;i++) {
    		int h = sc.nextInt();
    		if (i == 1) {
    			result = i;
    			x = h;
    		}else {
        		result = (Math.abs(a - t-x*0.006) >= Math.abs(a - t-h*0.006))?i:result;
        		x = (Math.abs(a - t-x*0.006) >= Math.abs(a - t-h*0.006))?h:x;
    		}
    	}

    	System.out.println(result);

    	sc.close();
    }
}
