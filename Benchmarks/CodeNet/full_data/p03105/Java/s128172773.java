import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args){
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ex){
			ex.printStackTrace();
		}

		String[] arg = str.split(" ");
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		int c = Integer.parseInt(arg[2]);

		if(a * c < b){
			System.out.println(c);
			return;
		}

		int res = b / a;

		if(res > 0){
			System.out.println(res);
		}else{
			System.out.println(0);
		}
	}
}
