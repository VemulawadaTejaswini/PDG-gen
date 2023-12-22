import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 1;
		int set[] = new int[num];
		set[0] = Integer.parseInt(br.readLine());
		for(int i = 1 ; i < num ; i++){
			int n = Integer.parseInt(br.readLine());
			int max = cnt, min = 0 , mid =0;
			while(max >= min){
				mid = (max+min)>>1 ;
				int now = set[mid];
				if(n == now){
					for(int j = mid ; j < cnt ; j++){
						set[j] = set[j+1];
					}
					cnt--;
					break;
				}else if(n > now){
					min = mid + 1;
				}else{
					max = mid - 1;
				}
			}
			if(max >= min){
				continue;
			}
			set[cnt] = n;
			Arrays.sort(set, 0, cnt++);;
		}
		System.out.println(cnt);

	}
}
