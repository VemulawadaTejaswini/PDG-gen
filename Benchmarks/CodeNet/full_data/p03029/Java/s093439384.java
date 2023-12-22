import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long[] tmp = toLongArray(in);
		System.out.println((tmp[0]*3+tmp[1])/2);

	}

	public static String[] readLineArray(BufferedReader in) throws Exception{
		return in.readLine().split(" ");
	}

	public static long[] toLongArray(String[] tmp) throws Exception{
		long[] ret = new long[tmp.length];
		for(int i=0;i<tmp.length;i++){
			ret[i] = Long.parseLong(tmp[i]);
		}
		return ret;
	}
	public static long[] toLongArray(BufferedReader in) throws Exception{
		return toLongArray(readLineArray(in));
	}
	public static String readLine(BufferedReader in) throws Exception{
		return in.readLine();
	}
	public static long toLong(String tmp) throws Exception{
		long ret = Long.parseLong(tmp);
		return ret;
	}
	public static long toLong(BufferedReader in) throws Exception{
		return toLong(readLine(in));
	}



}
