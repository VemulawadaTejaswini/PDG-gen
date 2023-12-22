import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.plaf.synth.SynthProgressBarUI;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		byte[] tmp = readLineByte();
		byte N = tmp[0];
		byte M = tmp[1];
		char[][] nums = new char[N][M];//[y][x]
		byte[][] rownums = new byte[N][M];//[y][x]
		char[][] hotmap = new char[N][M];//[rownum][x]
		for(byte rownum=0;rownum<N;rownum++) {
			for(byte x=0;x<M;x++) {
				hotmap[rownum][x] = (byte)0;
			}
		}
		for(byte y=0;y<N;y++) {
			nums[y] = readLineChar();
			for(byte x=0;x<M;x++) {
				byte rownum = (byte)((nums[y][x]-1)/M);
				rownums[y][x]=rownum;
				hotmap[rownum][x]++;
			}
		}
		
		
		//step 1
		while(!checkComplete(hotmap)) {
			
			printd(getMapString(hotmap));
			for(byte rownum=0;rownum<N;rownum++) {
				//rownum0番から順に最大列と0の列を見つける
				
				ArrayList<Byte> maxis = new ArrayList<>();
				ArrayList<Byte> zerois = new ArrayList<>();
				char max = hotmap[rownum][0];
				maxis.add((byte)0);
				for(byte x=1;x<M;x++) {
					if(max<hotmap[rownum][x]) {
						max = hotmap[rownum][x];
						maxis.clear();maxis.add(x);
					}
					else if(hotmap[rownum][x]==0) {
						zerois.add(x);
					}
				}
				//完成していたらスルー
				if(max==1) {continue;}
				boolean exchange_finished = false;//入れ替え処理実行フラグ
				for(byte p=0; p<maxis.size(); p++){
					byte maxi = maxis.get(p);
					//rownumの最大列と0列が入れ替えられるか確認
					for(byte i=0;i<zerois.size();i++) {
						byte zeroi = zerois.get(i);
						for(byte rownumt = 0; rownumt<N;rownumt++) {
							//ごくまれに無条件で成功することがある（突然変異）
							boolean mutation = (Math.random()<0.1);
							if(mutation||hotmap[rownumt][maxi]<hotmap[rownumt][zeroi]) {
								//入れ替え対象のrownum2つが決定
								//これらが本当に入れ替え可能か確認
								for(byte y=0;y<N;y++) {
									if(rownums[y][maxi]==rownum&&rownums[y][zeroi]==rownumt) {
										//入れ替え実行、即座に1回分の入れ替え処理終了
										
										if(mutation) {printd("mutation");}
										char t = nums[y][maxi];
										nums[y][maxi] = nums[y][zeroi];
										nums[y][zeroi] = t;
										
										byte t2 = rownums[y][maxi];
										rownums[y][maxi] = rownums[y][zeroi];
										rownums[y][zeroi] = t2;
										
										hotmap[rownum][maxi]--;
										hotmap[rownum][zeroi]++;
										
										hotmap[rownumt][maxi]++;
										hotmap[rownumt][zeroi]--;
										
										exchange_finished = true;
										printd(rownum+"<->"+rownumt+" @"+maxi+"<->"+zeroi);
										printd("row "+y);
										break;
									}
								}
							}
							if(exchange_finished) {break;}
						}
						if(exchange_finished) {break;}
					}
					if(exchange_finished) {break;}
				}
				if(exchange_finished) {break;}
			}
			printd(calcScore(hotmap));
			printd(getMapString(nums));
			printd();
		}
		print(getMapString(nums));
		//step 2
		for(byte x=0;x<M;x++) {
			char[] at = new char[N];
			for(byte y=0;y<N;y++) {
				at[y] = nums[y][x];
			}
			Arrays.sort(at);
			
			for(byte y=0;y<N;y++) {
				nums[y][x] = at[y];
			}
		}
		print(getMapString(nums));
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC
	
	private static String getMapString(char[][] map) {
		StringBuilder sb = new StringBuilder();
		for(int y=0;y<map.length;y++) {
			for(int x=0;x<map[y].length;x++) {
				sb.append((int)map[y][x]);
				if(x<map[y].length-1) {sb.append(" ");}
			}
			if(y<map.length-1) {sb.append("\n");}
		}
		return sb.toString();
	}

	private static String getMapString(byte[][] map) {
		StringBuilder sb = new StringBuilder();
		for(int y=0;y<map.length;y++) {
			for(int x=0;x<map[y].length;x++) {
				sb.append((int)map[y][x]);
				if(x<map[y].length-1) {sb.append(" ");}
			}
			if(y<map.length-1) {sb.append("\n");}
		}
		return sb.toString();
	}
	private static boolean checkComplete(char[][] hotmap) {
		for(int y=0;y<hotmap.length;y++) {
			for(int x=0;x<hotmap[y].length;x++) {
				if(hotmap[y][x]!=1) {return false;}
			}
		}
		return true;
	}
	private static long calcScore(char[][] hotmap) {
		long score = 0;
		for(int y=0;y<hotmap.length;y++) {
			for(int x=0;x<hotmap[y].length;x++) {
				score+=hotmap[y][x]*hotmap[y][x];
			}
		}
		return score;
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
	
}