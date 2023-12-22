import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = Integer.parseInt(sc.next());
		    String[] s = new String[n];
		    String[] ss = new String[n];
		    for(int i=0; i<n;i++) {
		    	s[i] = sc.next();
		    	char[] chars = new char[10];
		    	chars = s[i].toCharArray();
		    	Arrays.sort(chars);
		    	ss[i] = new String(chars);
		    }
		    Arrays.sort(ss);

		    long cnt = 0;
		    long cnt1 = 0;
		    for(int i=0;i<n-1;i++) {
		    	if(ss[i].equals(ss[i+1])) {
		    		cnt1++;
		    		cnt+=cnt1;
		    	}else {
		    		cnt1=0;
		    	}
		    }
		    System.out.println(cnt);

		    sc.close();
	}
}
