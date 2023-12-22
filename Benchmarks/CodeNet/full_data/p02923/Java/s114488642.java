import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		int[] data = getIntArry(st);
		int cnt = 0;
		int max = 0;
		for (int i=0;i<n-1;i++) {
			if (data[i] >= data[i+1]) {
				cnt++;
				if(max < cnt) {
					max = cnt;
				}
			} else {
				cnt = 0;
			}
		}
		anser(max);
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

	private static void anser(int num) {
		System.out.println(num);
	}
}