import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		proconScan proScan = new proconScan(" ");
		proScan.scan();
		Long xInteger = proScan.nextLong();
		Long buf = new Long(0);
		Long ans = new Long(1);
		while (true) {
			buf+=ans;
			if (xInteger <= buf) {
				break;
			}
			ans++;
		}
		System.out.println(ans);
		proScan.proconEnd();
	}

}

class proconScan {
	private BufferedReader br;
	private String inLine;
	private String[] inString;
	private Integer idx;
	private String splitChar;

	public proconScan() {
		br = new BufferedReader(new InputStreamReader(System.in));
		idx = 0;
		splitChar = " ";
	}

	public proconScan(String split) {
		br = new BufferedReader(new InputStreamReader(System.in));
		idx = 0;
		splitChar = split;
	}

	public void proconEnd() throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		br.close();
	}

	public String scan() throws IOException {
		idx = 0;
		inLine = br.readLine();
		inString = inLine.split(splitChar, 0);
		return inLine;
	}

	public Integer scanInteger1() throws IOException {
		scan();
		return Integer.parseInt(inString[0]);
	}

	public String backLine() {
		return inLine;
	}

	public String nextString() {
		return inString[idx++];
	}

	public String[] getString() {
		return inString;
	}

	public Long nextLong() {
		Long num;
		try {
			num = Long.parseLong(inString[idx++]);
		} catch (NumberFormatException e) {
			num = null;// TODO: handle exception
		}
		return num;
	}

	public Integer nextInteger() {
		Integer num;
		try {
			num = Integer.parseInt(inString[idx++]);
		} catch (NumberFormatException e) {
			num = null;// TODO: handle exception
		}
		return num;
	}

	public Integer[] getInteger() {
		Integer[] num = new Integer[this.getLen()];

		for (int i = 0; i < this.getLen(); i++) {
			num[i] = Integer.parseInt(inString[i]);
		}

		return num;
	}

	public Float nextFloat() {
		Float num;
		try {
			num = Float.parseFloat(inString[idx++]);
		} catch (NumberFormatException e) {
			num = null;// TODO: handle exception
		}
		return num;
	}

	public Float[] getFloat() {
		Float[] num = new Float[this.getLen()];

		for (int i = 0; i < this.getLen(); i++) {
			num[i] = Float.parseFloat(inString[i]);
		}

		return num;
	}

	public Integer getLen() {
		return inString.length;
	}

	public int[] getInt() {
		int[] num = new int[this.getLen()];

		for (int i = 0; i < this.getLen(); i++) {
			num[i] = Integer.parseInt(inString[i]);
		}

		return num;
	}

}