import java.io.*;
import java.util.*;

class Main{
	int H;
	int W;
	int[][][][] sc;
	public void run(){
		H = ni();
		W = ni();
		char[][] ob = new char[H][W];
		for(int i=0;i<H;i++){
			String s = next();
			for(int j=0;j<W;j++){
				ob[i][j] = s.charAt(j);
			}
		}
//		debug(ob);
	/*
	列aと列a+1がある
	このときaはrm[a], a+1はrm[a+1]ずれている
	このときのaとa+1間のスコアをsc[a][a+1][rm[a]][rm[a+1]]とする
	*/
		sc = new int[W][W][H+1][H+1];
		for(int i0 = 0;i0<W-1;i0++){
			for(int i2=0;i2<=H;i2++){
				for(int i3=0;i3<=H;i3++){
					int a = i0;
					int a1 = i0+1;
					int rma = i2;
					int rma1 = i3;
					int score = 0;
					for(int j=Math.max(rma, rma1);j<H;j++){
						if(ob[j-rma][a]  == ob[j-rma1][a1]){
							score++;
						}
					}
					sc[a][a1][rma][rma1] = score;						
				}
			}
		}
		int[] rm = new int[W];
		out.println(solve(ob, rm, 0));
	}


	int solve(char[][] ob, int[] rm, int n){
		if(n == (H * W)){
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<W;i++){
			if(rm[i] < H){
				//消した時のスコア計算
				//左列
				int score = 0;
				if(i>= 1){
					/*
					for(int j=Math.max(rm[i], rm[i-1]);j<H;j++){
//						debug(ob[j-rm[i]][i], ob[j-rm[i-1]][i-1]);
						if(ob[j-rm[i]][i]  == ob[j-rm[i-1]][i-1]){
							score++;
						}
					}
					*/
					score += sc[i-1][i][rm[i-1]][rm[i]];
				}
//				debug("\n");
				if(i< W-1){
					/*
					for(int j=Math.max(rm[i], rm[i+1]);j<H;j++){
//						debug(ob[j-rm[i]][i], ob[j-rm[i+1]][i+1]);
						if(ob[j-rm[i]][i] == ob[j-rm[i+1]][i+1]){
							score++;
						}
					}
					*/
					score += sc[i][i+1][rm[i]][rm[i+1]];
				}
				//右列
				rm[i]++;
				score += solve(ob, rm, n+1);
//				out.println(score);
				if(min > score)min = score;
				rm[i]--;
			}
		}
		return min;
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