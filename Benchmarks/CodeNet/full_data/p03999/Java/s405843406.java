import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		Input input = new Input();
		Converter conv = new Converter();

		String line = input.input();
		int sum = conv.int_(line);


		if(line.length() <= 2 ) {
			sum += conv.int_(line.substring(0,1)) + conv.int_(line.substring(1,2));
		}else{
			for(int i = 1;i<line.length();i++) {
				sum +=conv.int_(line.substring(0,i))+conv.int_(line.substring(i));
				sum += conv.int_(line.substring(i-1,i));
				}
			sum += conv.int_(line.substring(line.length()-1,line.length()));
		}
		System.out.println(sum);
		}
	}


class Input{

	private String buf;
	BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));

/**
 * 標準入力取得用メソッド
 * @return buf 標準入力
 */

	public String input() {
	try{
		this.buf = bufferdReader.readLine();
	}catch(Exception e) {
	}
	return buf;
	}
}


class Converter{

	private int convInt=0;
	private String convStrArr[];

	/**
	 * String⇒int変換メソッド
	 * @return this.convInt int型
	 * @param convInt 変換対象文字列
	 */
	public int int_(String convInt){
		this.convInt = Integer.parseInt(convInt);
		return this.convInt;
	}

	/**
	 * String⇒String[]変換メソッド
	 * @param convStrArr 変換対象文字
	 * @param breakStr 区切り文字
	 * @return this.convStrArr 文字配列
	 */
	public String[] strArr_(String convStrArr,String breakStr){
		this.convStrArr = convStrArr.split(breakStr,0);
		return this.convStrArr;
	}
}
