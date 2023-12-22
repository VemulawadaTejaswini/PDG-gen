import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	
	public static class State implements Comparable<State>{
		int number, count;
		
		public State(int number, int count){
			this.number = number;
			this.count = count;
		}
		
		@Override public int compareTo(State arg0){
			return Long.compare(this.count, arg0.count);
		}
	}
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			final int MAX = 100000;
			int[] count = new int[MAX + 1];
			
			ArrayList<ArrayList<State>> mod_states = new ArrayList<ArrayList<State>>();
			for(int i = 0; i < M; i++){
				mod_states.add(new ArrayList<State>());
			}
			
			for(int i = 0; i < N; i++){
				final int x = sc.nextInt();
				count[x]++;
			}
			
			for(int i = 0; i <= MAX; i++){
				if(count[i] == 0){ continue; }
				
				while(count[i] >= 2){
					mod_states.get(i % M).add(new State(i, 2));
					count[i] /= 2;
				}
				if(count[i] == 1){
					mod_states.get(i % M).add(new State(i, 1));
				}
			}
			
			for(int i = 0; i < M; i++){
				Collections.sort(mod_states.get(i));
			}
			
			// 先に 普通に浮いている 1 を取る
			long answer = 0;
			int[] mod_counts = new int[M];
			while(true){
				boolean updated = false;
				
				for(int fst = 0; fst < M; fst++){
					final int fst_index = mod_counts[fst];
					
					if(mod_states.get(fst).size() <= fst_index){ continue; }
					if(mod_states.get(fst).get(fst_index).count != 1){ continue; }
					//System.out.println(mod_states.get(fst).get(fst_index).number);
					
					final int snd = (M - fst) % M;
					final int snd_index = mod_counts[snd] + (fst == snd ? 1 : 0);
					
					if(mod_states.get(snd).size() <= snd_index){ continue; }
					if(mod_states.get(snd).get(snd_index).count != 1){ continue; }
					
					mod_states.get(fst).get(fst_index).count = 0;
					mod_states.get(snd).get(snd_index).count = 0;
					
					answer++;
					mod_counts[fst]++;
					mod_counts[snd]++;
					updated = true;
				}
				
				if(!updated){ break; }
			}
			//System.out.println(answer);
			
			// 2 を分解していいかどうか決める
			while(true){
				boolean updated = false;
				
				for(int one = 0; one < M; one++){
					final int one_fst_index = mod_counts[one];
					if(mod_states.get(one).size() <= one_fst_index){ continue; }
					if(mod_states.get(one).get(one_fst_index).count != 1){ continue; }
	
					final int one_snd_index = mod_counts[one] + 1;
					if(mod_states.get(one).size() <= one_snd_index){ continue; }
					if(mod_states.get(one).get(one_snd_index).count != 1){ continue; }
					
					final int two = mod_counts[(M - one) % M];
					final int two_index = mod_counts[two];
					if(mod_states.get(two).size() <= two_index){ continue; }
					if(mod_states.get(two).get(two_index).count != 2){ continue; }
					
					mod_states.get(one).get(one_fst_index).count = 1;
					mod_states.get(one).get(one_snd_index).count = 1;
					mod_states.get(two).get(two_index).count = 0;
						
					answer++;
					mod_counts[one] += 2;
					mod_counts[two] += 1;
					updated = true;
				}
				
				if(!updated){ break; }
			}
			
			for(int i = 0; i < M; i++){
				for(final State state : mod_states.get(i)){
					if(state.count >= 2){
						answer++;
					}
				}
			}
			
			System.out.println(answer);
		}
	}
	
	public static class Scanner implements AutoCloseable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {tok = new StringTokenizer(br.readLine());}
			} catch(IOException e){ /* ignore */ }
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine(); return tok.nextToken();
		}

		public int nextInt(){
			return Integer.parseInt(next());
		}
		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() {
			try{ br.close(); } catch (IOException e){ /*ignore*/ }
		}
	}
}
