import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int[] data1 = getIntArry(st);
		int n = data1[0];
		int k = data1[1];
		int[] data2 = getIntArry(st);
		int ans = 0;
		for(int i=0;i<n;i++) {
			if (data2[i] >= k) {
				ans++;
			}
		}
		anser(ans);
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

	private static void anser(int num) {
		System.out.println(num);
	}
}