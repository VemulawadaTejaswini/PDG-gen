import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String S = br.readLine();
    	br.close();
        char [] chars = S.toCharArray();
        int maxLength = 0;
        int cnt=0;
        int i=0;
        while(i<chars.length) {
        	if(chars[i]=='A'||chars[i]=='T'||chars[i]=='G'||chars[i]=='C') {
        		cnt++;
        	}else {
        		if(maxLength<cnt) {
        			maxLength=cnt;
        		}
        		cnt = 0;
        	}
        	i++;
        }
        System.out.println(maxLength);
    }
}