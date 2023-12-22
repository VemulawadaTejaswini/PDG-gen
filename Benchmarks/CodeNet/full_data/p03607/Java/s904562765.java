import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
  public static void main(String... args)throws IOException{
    FastScanner fs = new FastScanner();
    ArrayList<Long> list = new ArrayList<Long>();
    int n = fs.nextInt();
    for(int i=0;i<n;i++){
      long l = fs.nextLong();
      int index =list.indexOf(l);
      if(index == -1){
        list.add(l);
      }else{
        list.remove(index);
      }
    }
    System.out.println(list.size());
  }
}



class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine(){
			String line = "";
			try{
				line = br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			return line;
		}

		int nextInt() {
			return Integer.parseInt(nextToken());
		}

		long nextLong() {
			return Long.parseLong(nextToken());
		}

		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
