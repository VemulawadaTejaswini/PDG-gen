import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vd.readLine());
		int[] l =new int[n];
		String[] cd = vd.readLine().split(" "); 
		for(int i=0;i<n;++n) l[i]=Integer.parseInt(cd[i]);
		
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;++i) {
			if(max<l[i]) max=l[i];
		}
		for(int i=0;i<n;++i) {
			if(min>l[i]) min=l[i];
		}
		System.out.println(max-min);
	}

}
