import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		int counter = 0;
		if(list[0] == "1"){
			counter++;
		}
		if(list[1] == "1"){
			counter++;
		}
		if(list[2] == "1"){
			counter++;
		}
		System.out.println(counter);
	}
}