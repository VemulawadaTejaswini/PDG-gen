import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader vo = new BufferedReader(new InputStreamReader(System.in));
		String sy = vo.readLine();
		double a = Double.parseDouble(sy.split(" ")[0]);
		double b = Double.parseDouble(sy.split(" ")[1]);
		double c = Double.parseDouble(sy.split(" ")[2]);
		
		for(int x =1; x<1000;x++) {
			if((a*x/b)==c) {
				System.out.println("YES");
				break;
			}
		}
		
		
	}

}
