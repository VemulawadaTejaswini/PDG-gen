import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;

class Main{
	
	public Main(){}
	
	public void run(){
		try{
			Scanner s = new Scanner();
			int N = s.nextInt();
			int K = s.nextInt();
			s.reset();

            int[] value = new int[N];
            HashMap<Integer,Integer> nummap = new HashMap<>();

            for(int i = 0;i<N;i++){
                value[i] = s.nextInt();
                if(nummap.containsKey(value[i])){
                    nummap.put(value[i],s.nextInt()+nummap.get(value[i]));
                }else{
                    nummap.put(value[i],s.nextInt());
                }
                s.reset();
            }

            Arrays.sort(value);
            int count = 0;
            for(int key:nummap.keySet()){
                count += nummap.get(key);
                if(K<=count){
                    System.out.println(key);
                    break;
                }
            }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] argv){
		Main main = new Main();
		main.run();
	}
	
	private class Scanner{
		private int p;
		private BufferedReader br;
		String regex = " ";
		String[] token;

		public Scanner(){
			br = new BufferedReader(new InputStreamReader(System.in));
			p = -1;
			token = new String[0];
		}
		
		void setRegex(String str){
			this.regex = str;
		}
		
		void reset(){
			p = -1;
			token = new String[0];
		}
		
		String next() throws IOException{
			if(p < 0){
				String line = br.readLine();
				while("".equals(line))line = br.readLine();
				token = line.split(regex,0);
				p = 0;
				return token[p++];
			}else{
				if(p<token.length)return token[p++];
				p = -1;
				return null;
			}
		}
	
		int nextInt() throws NumberFormatException, IOException{
			return Integer.parseInt(next());
		}
		
		long nextLong() throws NumberFormatException, IOException{
			return Long.parseLong(next());
		
		}
		
		double nextDouble() throws NumberFormatException, IOException{
			return Double.parseDouble(next());
		}
		
		String nextString() throws NumberFormatException, IOException{
			return next();	
		}		
	}
}