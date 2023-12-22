import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int size = Integer.parseInt(input[0]);
		String s = input[1];
		char[] arr = s.toCharArray();
 
		int x = 0;
		int max = 0;
 
		for(int i = 0; i < size; i++){
			char c = arr[i];
			if(c =='I'){
				x += 1;
			}else{
				x--;
			}
			max = Math.max(max,x);
		}
		System.out.println(max);
	}
}