import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args){
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String n_str, a_str;
		try {
			n_str = new String(in.readLine());
			a_str = new String(in.readLine());
			int n = Integer.parseInt(n_str);
			if(n<1 || n>100) throw new Exception();
			String[] a_str_arr = a_str.split(" ", 0);
			if(n != a_str_arr.length) throw new Exception();
			int[] a_arr = new int[a_str_arr.length];
			int max=0;
			int min=1000;
			for(int i=0; i<a_str_arr.length; i++){
				int a = Integer.parseInt(a_str_arr[i]);
				if(a<0 || a>1000) throw new Exception();
				if(max<a) max = a;
				if(min>a) min = a;
			}
			System.out.println(max-min);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}