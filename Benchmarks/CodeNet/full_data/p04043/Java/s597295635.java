import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	// プログラミング開始時のテンプレ
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] a = strToIntArray(br.readLine());
			Arrays.sort(a);
			if(a[0] == 5 && a[1] == 5 && a[2] == 7){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			System.out.println();
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
