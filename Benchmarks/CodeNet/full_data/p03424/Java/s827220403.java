
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer stk = new StringTokenizer(str);
        int n = Integer.parseInt(stk.nextToken());
        HashMap<String,Integer>hm = new HashMap<>();
        str = br.readLine().trim();
        stk = new StringTokenizer(str);
        for(int i=0;i<n;i++) {
        	String s = stk.nextToken();
        	hm.put(s, 1);
        }
        if(hm.size()==3)System.out.println("Three");
        else if(hm.size()==4)System.out.println("Four");

	}

}
