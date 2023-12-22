import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class Main{
	static class MyScanner {
	    BufferedReader br;
	    StringTokenizer st;

	    public MyScanner() {
	       br = new BufferedReader(new InputStreamReader(System.in));
	    }

	    String next() {
	        while (st == null || !st.hasMoreElements()) {
	            try {
	                st = new StringTokenizer(br.readLine());
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return st.nextToken();
	    } 

	    int nextInt() { return Integer.parseInt(next());}

	    long nextLong() {return Long.parseLong(next());}

	    double nextDouble() {return Double.parseDouble(next());}

	    String nextLine(){
	        String str = "";
		  try {
		     str = br.readLine();
		  } catch (IOException e) {
		     e.printStackTrace();
		  }
		  return str;
	    }
	}
		
	
		 public static void main(String[] args) throws IOException {
			 	PrintWriter out = new PrintWriter(System.out);
			    MyScanner sc = new MyScanner();
			 	Main solver = new Main();
				solver.solve(out, sc);
				out.flush();
				out.close();
			
		 }
	
		
		 
		 
		
 		void solve(PrintWriter out, MyScanner sc) throws IOException{	
 			
 			int a = sc.nextInt();
 			int b = sc.nextInt();
 			int c = sc.nextInt();
 			int k = sc.nextInt();
 			
 			while(k-- > 0) {
 				int max = Math.max(a, Math.max(c, b));
 				if(max == a) a *= 2;
 				else if(max == b) b *= 2;
 				else c *= 2;
 			}
 			out.print(a + b + c);
 			
 				
 			
 			
 			
 		
 		}
 		
 		

 	
		
	
			
		
		
		
		
		
		
		
		
	
	
}

