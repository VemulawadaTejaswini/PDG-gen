import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{


		// 読み込み
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] temp;

		line=br.readLine();
		temp=line.split(" ");

		int a = Integer.valueOf(temp[0]);
		int b = Integer.valueOf(temp[1]);
		int c = Integer.valueOf(temp[2]);


		if (c >= a && c <= b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
