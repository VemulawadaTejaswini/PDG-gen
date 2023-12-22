import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int price = 700;
		String line = readLine();
		String[] strArray = line.split("");
		for (int i = 0; i < strArray.length; i++){
			if(strArray[i].equals("o")){
				price += 100;
			}
		}
		System.out.println(price);
	}

	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}