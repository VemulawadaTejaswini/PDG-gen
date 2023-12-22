import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader stdreader = new BufferedReader(
			new InputStreamReader(System.in));
		String input = stdreader.readLine();
		String[] inputs = input.split(" ");
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
	
		if(a <= c && c <= b){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}	
	}
}