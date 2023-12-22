import java.io.*;
import java.util.*;

public class main1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    StringTokenizer st = new StringTokenizer(line);
	    int a = Integer.parseInt(st.nextToken());
	    int b = Integer.parseInt(st.nextToken());
	    if ((a*b) % 2==0) {
	    		System.out.println("Even");
	    }
	    else {
	    		System.out.println("Odd");
	    }

	}

}