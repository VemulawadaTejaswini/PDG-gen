import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		
		int time = 0;
		if(m == 0){
			time = n * 100;
		}
		else if(m == 1){
			time = 200*(n + 18);
		}
		else if(m == 2){
			time = 400*(n + 36);
		}
		else if(m == 3){
			time = 800*(n + 54);
		}
		else if(m == 4){
			time = 1600*(n + 72);
		}
		else {
			time = 3200*(n + 90);
		}
		
		System.out.println(time);
	}

}
