import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		long N = toLong(in);
		ArrayList<long[]> list = new ArrayList<long[]>();
		for(int i=0;i<N;i++){
			long[] tmp = toLongArray(in);
			list.add(tmp);
		}

		List<long[]> anslist = new ArrayList<long[]>();
		long[] input = list.get(0);
		for(int x=0;x<101;x++){
			for(int y=0;y<101;y++){
				long h = input[2] + Math.abs(input[0]-x) + Math.abs(input[1]-y);
				if(h > 0){
					anslist.add(new long[]{x,y,h});
				}
			}
		}

		//いずれかで一致するはずなので
		for(int i=1;i<list.size();i++){
			input = list.get(i);
			for(int k=anslist.size()-1;k>=0;k--){
				long[] tmp = anslist.get(k);
				if(tmp[2] - Math.abs(input[0]-tmp[0])-Math.abs(input[1]-tmp[1]) != input[2]){
					anslist.remove(k);
				}
			}
		}
		long[] ans = anslist.get(0);
		System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);

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
