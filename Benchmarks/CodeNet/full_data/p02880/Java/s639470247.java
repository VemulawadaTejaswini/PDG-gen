import java.util.*;
import java.io.*;
 
public class Main {
 
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
 
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
 
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
 
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        }  
    }
 
    public static void main(String[] args) throws IOException {
 
        FastReader s= new FastReader();
 
        int n = s.nextInt();
 
        int count = 1;
        boolean found = false;
        
        for (int i = 1; i < 10; i++) {
        	if (found == false) {
        		for (int j=count;j<10;j++) {
        			if (i * j == n) {
        				found = true;
        				break;
        			}
        		}
        	} else {
        		break;
        	}
        }
        
        if (found == true)
        	System.out.println("Yes");
        else {
        	System.out.println("No");
        }
 
    }
}