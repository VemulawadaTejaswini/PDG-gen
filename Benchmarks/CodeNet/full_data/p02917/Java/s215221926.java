import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] b = new int[n-1];
		    int ans =0;
		    for(int i=0;i<n-1;i++) {
		    	b[i] = sc.nextInt();
		    	if(i==0) {
		    		ans += 2*b[i];
		    	}else{
		    		if(b[i]>b[i-1]){
		    			ans += b[i];
		    		}else {
		    			ans -= b[i-1];
		    			ans += 2*b[i];
		    		}
		    	}
		    }
		    System.out.println(ans);

		    sc.close();
	}
}
