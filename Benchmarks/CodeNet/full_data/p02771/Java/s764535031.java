import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader in = new  BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(in.readLine());
    	int a = Integer.parseInt(st.nextToken()),
    		b =	Integer.parseInt(st.nextToken()),
    		c =	Integer.parseInt(st.nextToken());
    	boolean r;
    	if(a == b) {
    		if(c == b) {
    			r = false;
    		}else {
    			r = true;
    		}
    	}else if(a == c) {
    		if( c== b) {
    			r = false;
    		}else {
    			r = true;
    		}
    	}else {
    		if(c == b) {
    			r = true;
    		}else {
    			r = false;
    		}

    	}
    	if(r) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}