import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.*;
import java.util.stream.Collectors;


class Main{
  public static void main(String[] args){
    FastScanner fs = new FastScanner();
    List<Long> list = new ArrayList<Long>();
    long num1 = fs.nextLong();
    long num2 = fs.nextLong();
    long count=0;
    for(int i=0;i<num1;i++){
      list.add(fs.nextLong());
    }
    List<Long>  newList =
         list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    for(int j=0;j<num2;j++){
      count += newList.get(j);
    }
    System.out.println(count);
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
