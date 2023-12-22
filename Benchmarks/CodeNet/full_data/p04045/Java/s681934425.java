import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] a = strToIntArray(br.readLine());
			int N = a[0];
			int K = a[1];

			String[] d = br.readLine().split(" ");

			label: for (int i = N; i <= 10000; i++) {
				String Nstr = Integer.toString(i);
				for (String string : d) {

					if(Nstr.matches(string)){
						continue label;
					}
				}


				System.out.println(i);
				break;
			}
		} catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}

	// Stringで読みこんでスペースで分割されている数字を配列に入れるやつ
	// 利用法 int[] A = strTointArray(br.readLine());
	static int[] strToIntArray(String S) {
		String[] strArray = S.split(" ");
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
}
