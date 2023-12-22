import java.io.*;
import java.util.*;

class Main{
	public void run(){
		/*
		・方向が1つ前と同じならつなぐ数は1つ前と変化しない
		・方向が1つ前と変わった場合、1つ前の方向ですでに置かれた数だけ最大数から減った数
		*/
		int W = ni();
		int H = ni();
		Long[] cs = new Long[W+H];
		HashSet<Long> w = new HashSet<>();
		HashSet<Long> h = new HashSet<>();
		for(int i=0;i<W;i++){
			long t = (long)ni();
			w.add(t);
			cs[i] = t;
		}
		for(int i=0;i<H;i++){
			long t = (long)ni();
			h.add(t);
			cs[i+W] = -t;
		}
		Arrays.sort(cs, new Comparator<Long>(){
			public int compare(Long o1, Long o2){
				return (int)(Math.abs(o1) - Math.abs(o2));
			}
		});
//		debug(cs);
		long cost = 0;
		long wp = 0;
		long hp = 0;

		if(cs[0] >= 0){
			cost += (H + 1) * cs[0];
			wp++;
		}else{
			cost -= (W + 1) * cs[0];
			hp++;
		}
//		debug(cost);

		for(int i=1;i<W+H;i++){

			if(cs[i] >= 0){
				long tmp = (H  + 1 - hp) * cs[i];
//				debug(tmp);
				cost += tmp;
				wp++;
			}else{
				long tmp = (W + 1 - wp) * cs[i];
				cost -= tmp;
				hp++;
			}
		}
		out.println(cost);
	}

	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().run();
		out.flush();
	}

	public Main(){
	}

	int ni(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;	}

	long nl(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	double nd(){
		return Double.parseDouble(next());
	}

	String next(){
		int c;
		while(!isAlNum(c = read()));
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	String nextLine(){
		int c;
		while(!isAlNumOrSpace(c = read()));
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNumOrSpace(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
	private static boolean isAlNumOrSpace(int c){
		return isAlNum(c) || c == ' ' || c == '\t';
	}
	void debug(Object... os){
		out.println(Arrays.deepToString(os));
	}
}