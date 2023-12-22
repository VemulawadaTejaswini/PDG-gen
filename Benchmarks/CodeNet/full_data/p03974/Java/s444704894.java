import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<String> lines = new ArrayList<String>();
		String[] index = new String[N];
		for(int i = 0; i < N;i++){
			index[i] = input.next();
			lines.add(index[i]);
		}
		int Q = input.nextInt();
		for(int i = 0; i < N;i++){
			int t = input.nextInt()-1;
			String query = input.next();
			HashMap<Character, Integer> seq = new HashMap<Character, Integer>();
			
			for(int j = 0; j <26; j++){
				seq.put(query.charAt(j), j);
			}
			Collections.sort(lines, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					int l = Math.min(o1.length(), o2.length());
					for(int k = 0; k < l; k++){
						if(seq.get(o1.charAt(k))<seq.get(o2.charAt(k))) return -1;
						else if (seq.get(o1.charAt(k))>seq.get(o2.charAt(k))) return 1;
					}
					if(l == o1.length()) return -1;
					return 1;
				}
			});
			int r = 0;
			for(; r < lines.size(); r++){
				if(lines.get(r) == index[t]) break;
			}
			System.out.println(r+1);
		}
		input.close();	
		
				
		
	}



}