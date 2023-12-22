import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		String S =nextString();
		String ans = "AC";
		StringBuffer sb = new StringBuffer(S);
		for(int i=2;i<sb.length()-1;i++){
			if(sb.charAt(i)=='C'){
				sb.deleteCharAt(i);
				break;
			}
			if(i==sb.length()-2){
				sb.append("C");
			}
		}

		if(sb.charAt(0)=='A'){
			sb.deleteCharAt(0);
		}else{
			sb.append("C");
		}

		while(sb.length()>0){
			if(Character.isUpperCase(sb.charAt(0))){
				break;
			}
			sb.deleteCharAt(0);
		}
		System.out.println(sb.length()==0?"AC":"WA");
	}




	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}
