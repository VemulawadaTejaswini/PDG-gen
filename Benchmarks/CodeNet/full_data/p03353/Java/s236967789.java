import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int K = in.nextInt();
		TreeSet<String> ts = new TreeSet<>((s1,s2)->s1.compareTo(s2));
		
		for(int i = 1; i <= s.length(); i++){
			for(int j = 0; j + i - 1 <= s.length() - 1; j++){
				String ss = s.substring(j, j + i);
				//System.out.print(ss + " ");
				ts.add(ss);
			}
		}
		
		//for(String ss : ts) System.out.print(ss + " ");
		//System.out.println();
		for(int i = 0; i < K - 1; i++){
			ts.pollFirst();
		}
		System.out.println(ts.pollFirst());
	}
}
