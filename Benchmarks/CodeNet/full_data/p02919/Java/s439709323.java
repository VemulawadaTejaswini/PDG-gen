import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, Exception{
		BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
		int n = getInt(st);
		int[] data = getIntArry(st);
		int ans = 0;
		for(int l=0;l<n-1;l++) {
			for(int r=l+1;r<n;r++) {
				int max = 0;
				int ne = 0;
				for(int i=l;i<=r;i++) {
					if(max < data[i]) {
						ne = max;
						max = data[i];
					} else if(ne < data[i]) {
						ne = data[i];
					}

				}
				ans+=ne;
			}
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

	private static void anser(int num) {
		System.out.println(num);
	}
}