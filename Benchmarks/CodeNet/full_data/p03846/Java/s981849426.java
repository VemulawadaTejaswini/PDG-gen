import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String strn = input.readLine( );
		int n = Integer.parseInt(strn);

		String stra = input.readLine( );
		String[] stralist = stra.split(" ");
		int[] a = new int[n];
		int count = 0;

		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(stralist[i]);
			if(a[i]%2 == 0){
				count = count+1;
			}
		}

		Arrays.sort(a);

		long answer = 1;
		if(n==1){
			if(a[0]==0){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}else if(count==0){
			for(int i=0; i<n; i++){
				if(i%2 == 0 && a[i] != i+1){
					System.out.println(0);
					break;
				}else if(i%2 == 1 && a[i] != i){
					System.out.println(0);
					break;
				}
				if(i%2==0){
					answer = answer * 2 % ((long) Math.pow(10, 9) + 7);
				}
				if(i==n-1){
					System.out.println(answer);
				}
			}
		}else if(count==n){
			for(int i=1; i<n; i++){
				if(i%2 == 0 && a[i] != i){
					System.out.println(0);
					break;
				}else if(i%2 == 1 && a[i] != i+1){
					System.out.println(0);
					break;
				}
				if(i%2==0){
					answer = answer * 2 % ((long) Math.pow(10, 9) + 7);
				}
				if(i==n-1){
					System.out.println(answer);
				}
			}
		}else{
			System.out.println(0);
		}
	}
}

