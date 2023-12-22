import java.util.*;
import java.io.*;

public class Main{

	
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] H = new int[N];

		for(int i = 0;i < N;i++){
			H[i] = stdIn.nextInt();
		}

		int ans = 0;
		int temp = 0;

		boolean isChange = true;

		for(int i = 0;i < N - 1;i++){
			if(H[i] >= H[i + 1]){
				temp++;
				if(ans < temp){
					isChange = true;
				}
				
			}
			else{
				if(isChange){
					ans = temp;
				}
				temp = 0;
				isChange = false;
			}
			//System.out.println(temp + " " + ans);
		}
		if(isChange){
			ans = temp;
		}
		System.out.println(ans);
	}
}