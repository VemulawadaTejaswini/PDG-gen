import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str = br.readLine();
		if(str.indexOf("AC") !=-1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}