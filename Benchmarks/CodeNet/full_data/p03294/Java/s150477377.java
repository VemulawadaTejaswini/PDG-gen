import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vd.readLine());
		String[] bd = vd.readLine().split(" ");
		vd.close();
		int[] a = new int[bd.length];
		for(int i=0; i<bd.length;++i) a[i] = Integer.parseInt(bd[i]);
		int sum=0;
		do {
			for(int i=0; i<bd.length;++i) a[i] = a[i] % n;
			for(int i=0; i<bd.length;++i) sum = sum + a[i];
		}while(sum > n);
		System.out.println(sum);
		
	}

}
