import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	br.close();
	int rgd = 999;
	int sft = 753;
    	for (int i=0;i<s.length()-2;i++) {
	    int sub = Integer.parseInt(s.substring(i,i+3));
	    if (Math.abs(sft-sub) < rgd) {
		rgd = (int)Math.abs(sft-sub);
	    }
	}
	System.out.println(rgd);
    }	
}