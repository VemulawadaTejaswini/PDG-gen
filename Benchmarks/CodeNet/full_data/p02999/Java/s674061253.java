import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String line = readLine();
		String[] strArray = line.split(" ");
		int[] array = new int[2];
		for(int i = 0; i < 2; i++){
			array[i] = Integer.parseInt(strArray[i]);
		}
		if(array[0] < array[1]){
			System.out.println("0");
		}else{
			System.out.println("10");
		}
	}


	private static String readLine() throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		return br.readLine();
	}
}