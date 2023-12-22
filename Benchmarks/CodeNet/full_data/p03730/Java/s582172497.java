import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static int a,b,c;
	public static void main(String[] args)throws IOException {
		System.out.println("文字入力：");
		BufferedReader stdreader = new BufferedReader(new InputStreamReader(System.in));
		String line = stdreader.readLine();
		String[] integers = line.split(" ");
		a = Integer.parseInt(integers[0]);
		b = Integer.parseInt(integers[1]);
		c = Integer.parseInt(integers[2]);

		Main mn = new Main();
		System.out.println((mn.check(a,b,c))?"Yes" : "No");
	}

	private boolean check(int a, int b, int c){
		if(c==0) return true;
		for(int i =0; i < 101; i++){
			if((b*i + c) % a == 0) return true;
		}
		return false;
	}
}