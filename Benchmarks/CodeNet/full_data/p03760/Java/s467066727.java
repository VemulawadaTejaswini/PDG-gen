import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 2; //文字列を何行受け取るか
		for(int i = 0; i < strN; i++){
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");

		InterchangeablyJoin(param);
	}
	
	static void InterchangeablyJoin(String[] param){
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < param[0].length(); i++){
			buffer.append(param[0].charAt(i));
			if(i > param[1].length()-1) break;
			buffer.append(param[1].charAt(i));
		}
		System.out.println(buffer.toString());
	}

}