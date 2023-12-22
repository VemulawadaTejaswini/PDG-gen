import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
		int n = ni();
		int m = ni();
		int[] aa = new int[m];
		int[] ba = new int[m];
		int[] g = new int[n + 1];
		int gid = 1;
		long result = n*(n-1)/2;
		Deque<Long> q = new ArrayDeque<>();
		q.push(result);
		
		for(int i = 0; i < m; i++){
			aa[i] = ni();
			ba[i] = ni();
		}
		
		Map<Integer,Long> gmap = new HashMap<>();

		for(int i = m - 1; i > 0; i--){
			int a = aa[i];
			int b = ba[i];
			//System.out.println(a + "/" + b);
			if(g[a] == 0 && g[b] == 0){
				g[a] = gid;
				g[b] = gid;
				gmap.put(gid,2L);
				gid++;
				result -= 1;
			}else if(g[a] != 0 && g[b] == 0){
				g[b] = g[a];
				result -= gmap.get(g[a]);
				gmap.put(g[a],gmap.get(g[a]) + 1);
			}else if(g[a] == 0 && g[b] != 0){
				g[a] = g[b];
				result -= gmap.get(g[b]);
				gmap.put(g[b],gmap.get(g[b]) + 1);
			}else{
				if(g[a] != g[b]){
					int newid = g[a];
					int oldid = g[b];
					for(int j = 0; j < n; j++){
						if(g[j] == oldid){
							g[j] = newid;
						}
					}
					//System.out.println(gmap.get(g[a]) + ":" + gmap.get(g[b]));
					result -= gmap.get(g[a]) * gmap.get(g[b]);
					gmap.put(newid,gmap.get(g[a]) + gmap.get(g[b]));
					gmap.remove(oldid);
				}
				
			}
			q.push(result);
		}
		while(!q.isEmpty()){
			System.out.println(q.pop());
		}
	}

    //Switch input source (stdin/file)
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
        String debugDataPath = System.getenv("DD_PATH");        
        if(debugDataPath != null){
            try{
                scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath)))));
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
        solve();
	}

    //Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(scanner.nextLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
    //Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
    //Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
    //Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
    //Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
    //Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}