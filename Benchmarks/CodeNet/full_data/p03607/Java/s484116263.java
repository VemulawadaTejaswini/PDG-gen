import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			int max = cnt, min = 0 , mid =0 , flg =0;
			int index = -1;
			while(max >= min){
				int temp = mid;
				mid = (max+min)>>1 ;
				if(n == set[mid]){
					for(int j = mid ; j < cnt ; j++){
						set[j] = set[j+1];
					}
					cnt--;
					break;
				}else if(n > set[mid]){
					min = mid + 1;
					flg |= 1;
				}else{
					max = mid - 1;
					flg |= 2;
				}
				if(flg == 3){
					flg = 4;
					index = temp;
				}else if(flg == 2){
					index = 0;
				}else if(flg == 1){
					index = cnt;
				}
			}
			if(max >= min){
				continue;
			}
			for(int j = index ; j < cnt ; j++){
				set[j+1] = set[j];
			}
			set[index] = n;
			cnt++;
		}
		System.out.println(cnt);

	}
}
