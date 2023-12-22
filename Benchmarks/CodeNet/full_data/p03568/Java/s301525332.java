import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] spl = br.readLine().split(" ");
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] =Integer.parseInt(spl[i]);
			if(a[i] == 1 || a[i] == 100){
				 b[i] = 2;
			}else{
				 b[i] = 3;
			}
			if((a[i]&1) == 0){
				if(a[i] == 100){
					 c[i] = 1;
				}else{
					 c[i] = 2;
				}
			}else{
				c[i] = 1;
			}
		}
		int sum = 0;
		for(int k = 0 ; k < n ; k++){
			for(int i = 0 ; i < 3 ; i++){
				int num = a[k] + i -1;
				int sub = 0;
				if((num&1)==0){
					if(num != 0){
						sub = 1;
						for(int j = 0 ; j < n ; j++){
							if(j < k){
								sub *= c[j];
							}else if(j > k){
								sub *= b[j];
							}
						}
					}
				}
				sum += sub;
			}
		}
			System.out.println(sum);
	}
}
