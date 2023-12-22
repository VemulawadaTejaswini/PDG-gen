import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		HashMap mMap = new HashMap();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = Integer.parseInt(str);

		str = scan.nextLine();
		String[] substr = str.split(" ", 0);

        int min = 100;
        int max = 1;
		for (int i=0; i<n; i++) {
			int target = Integer.parseInt(substr[i]);
			if (target > max) {
				max = target;
			}
			if (target < min) {
				min = target;
			}
		}


        int ans = 0;
        int buf = 0;
        for (int i = min; i < max; i++) {
        	buf = 0;
    		for (int j=0; j<n; j++) {
    			int target = Integer.parseInt(substr[j]);
            	buf = buf + (target  - i) * (target  - i);
            }
        	if (ans == 0) {
        		ans = buf;
        	} else if (ans > buf) {
        		ans = buf;
        	}

        }
		scan.close();
		System.out.println(ans);
	}
}