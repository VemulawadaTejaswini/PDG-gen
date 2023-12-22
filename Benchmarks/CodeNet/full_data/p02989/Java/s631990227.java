import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int d[]= new int[n];
	    for(int i=0;i<n;i++) {
	    	d[i]=scan.nextInt();
	    }
	    scan.close();

	    Arrays.sort(d);

	    int ans = d[n/2] - d[n/2-1];

	    System.out.println(ans);

	}

}