import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.regex.Matcher;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
public class Main implements Runnable{
		
		
		 boolean is = false;
		 public static void main(String[] args) throws IOException {
			new Thread(null , new Main(),"Main", 1<<26).start();
	
		 }
	
		 
		public void run(){
			try {
			PrintWriter out = new PrintWriter(System.out);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = null;
			String s = br.readLine();
			//out.println(s.length());
			int[] a = new int[26];
			for(int i = 0; i < s.length() ; ++i) {
				a[s.charAt(i) - 'a']++;
			}
			if(s.length() < 26) {
				int i = 0;
				for(; i < 26; ++i) {

					if(a[i] == 0) break;
				}
				char c =(char) ('a' + i);
				out.println(s + c);
			}else {
				int i = s.length() - 1;
				for(;i >= 0; --i) {
					if(s.charAt(i) == 'z') continue;
					else {
						int k = s.charAt(i) + 1;
						for(; k < 'z'; ++k) {
							boolean is = false;
							int l = 0;
							for( ; l < i; ++l) {
								if(s.charAt(l) > s.charAt(i)) break;
								
							}
							if(l == i) {
								is = true;
								char c = (char) k;
								out.println(s.substring(0, i) + k);
								break;
							}if(is) break;
						}
						
					}
				}
				if(i == -1) out.println(-1);
			}
			out.close();
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
}