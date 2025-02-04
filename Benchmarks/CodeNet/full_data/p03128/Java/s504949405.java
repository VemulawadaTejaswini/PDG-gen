import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	static class Task {
		
		int[] mapper = {0,2,5,5,4,5,6,3,7,6};
		Integer[] rankingArray = {1,7,4,2,3,5,9,6,8};
		ArrayList<Integer> ranking = new ArrayList<>(Arrays.asList(rankingArray));
		Integer[] rankingMapping = {-1,0,3,4,2,5,7,1,8,6};
		
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            HashSet<Integer> nums = new HashSet<Integer>();
            for(int i=0; i<m; i++) {
            	nums.add(in.nextInt());
            }
            
            for(int i=8; i>=0; i--) {
            	if(!nums.contains(ranking.get(i)))
            		ranking.remove(i);
            }
            
            String ans = use(n, "");
            
            TreeMap<Character, Integer> finalDigits = new TreeMap<Character, Integer>();
            for(int i=0; i<ans.length(); i++) {
            	finalDigits.merge(ans.charAt(i), 1, Integer::sum);
            }
            
            String finalans = "";
            for(Character c : finalDigits.descendingKeySet()) {
            	for(int i=0; i<finalDigits.get(c); i++) {
            		finalans += c;
            	}
            }
            
            out.println(finalans);
        }
        
        public String use(int sticks, String num) {
        	if(sticks == 0)
        		return(num);
        	if(sticks < 0)
        		return(null);
        	
        	String ans = "";
        	for(int i=0; i<ranking.size(); i++) {
        		int newSticks = sticks - mapper[ranking.get(i)];
        		String newNum = num + Integer.toString(ranking.get(i));
        		ans = use(newSticks, newNum);
        		if(ans != null)
        			return(ans);
        	}

        	return ans;
        }
    }
	
    public static void main(String argds[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
    }	
}