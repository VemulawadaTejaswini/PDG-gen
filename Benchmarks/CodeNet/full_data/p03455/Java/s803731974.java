import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = null;
		while((line=reader.readLine()) != null){
			String[]splitLine = line.split(" ");
			if(Integer.parseInt(splitLine[0])%2 == 0 || Integer.parseInt(splitLine[1])%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
		}
		reader.close();
	}
}
