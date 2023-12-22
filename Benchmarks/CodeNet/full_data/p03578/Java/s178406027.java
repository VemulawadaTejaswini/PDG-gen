import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int d[] = new int[num];
		String[] spl = br.readLine().split(" ");
		for(int i = 0 ; i < num ; i++){
			d[i] = Integer.parseInt(spl[i]);
		}
		Arrays.sort(d);
		int m = Integer.parseInt(br.readLine());
		int t[] = new int[m];
		spl = br.readLine().split(" ");
		for(int i = 0 ; i < m ; i++){
			t[i] = Integer.parseInt(spl[i]);
		}
		boolean flg = true;
		for(int i = 0 ; i < m ; i++){
			flg = true;
			for(int j = 0 ; j < num ; j++){
				if(d[j] > t[i]){
					break;
				}else if(d[j] == t[i]){
					d[j] = -1;
					flg = false;
					break;
				}
			}
			if(flg){
				break;
			}
		}
		if(flg){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
		
	}
}