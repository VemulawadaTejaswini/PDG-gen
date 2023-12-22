import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		int[] data = getIntArry(st);
		int[] ans = new int[n];
		for(int i=0;i<n;i++) {
			ans[data[i]-1] = i + 1;
		}
		anser(ans);
	}

	private static int getInt(BufferedReader st) throws Exception, IOException {
		int num = Integer.parseInt(st.readLine());
		return num;
	}

	private static int[] getIntArry(BufferedReader st) throws Exception, IOException {
		String line = st.readLine();
		String[] strData = line.split(" ");
		int[] intData = new int[strData.length];
		for (int i = 0; i < strData.length; i++) {
			intData[i] = Integer.parseInt(strData[i]);
		}
		return intData;
	}

	private static void anser(int[] numData) {
		String ans = "#";
		for (int i = 0; i < numData.length; i++) {
			ans = ans + " " + numData[i];
		}
		ans = ans .replace("# ", "");
		System.out.println(ans);
	}
}