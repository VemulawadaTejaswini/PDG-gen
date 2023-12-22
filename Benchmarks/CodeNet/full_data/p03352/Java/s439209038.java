import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(vd.readLine());
		
		int i=0;
		do {
			i++;
		}while(Math.pow(i, 2)<=x);
		System.out.println((i-1)*(i-1));
	}

}
