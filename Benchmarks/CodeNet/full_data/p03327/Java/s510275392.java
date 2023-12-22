import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vd.readLine());

		if(n>=1100) System.out.println("ABD"+(n-1000+1));
		if(n>=1010&&n<1100) System.out.println("ABD0"+(n-1000+1));
		if(n>=1000&&n<1010) System.out.println("ABD00"+(n-1000+1));
		if(n>=100&&n<1000) System.out.println("ABC"+n);
		if(n>=10&&n<100) System.out.println("ABC0"+n);
		if(n>=1&&n<10) System.out.println("ABC00"+n);

	}

}
