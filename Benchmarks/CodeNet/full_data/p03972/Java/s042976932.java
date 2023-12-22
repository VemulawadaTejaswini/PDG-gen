import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ");
		int w = Integer.valueOf(first[0]);
		int h = Integer.valueOf(first[1]);
		Integer[] xArray = new Integer[w];
		Integer[] yArray = new Integer[h];
		int xSum = 0;
		int ySum = 0;
		long result = 0;
		for (int i = 0; i < w; i++) {
			xArray[i] = Integer.valueOf(br.readLine());
			xSum += xArray[i];
		}
		for (int i = 0; i < h; i++) {
			yArray[i] = Integer.valueOf(br.readLine());
			ySum += yArray[i];
		}
		Arrays.sort(xArray);
		Arrays.sort(yArray);
		// for(int i=1;i<=w;i++){
		// for(int j=1;j<=h;j++){
		// result += min(xArray[i-1],yArray[j-1]);
		// }
		int wcount = 0;
		int hcount = 0;
		for (int count = 1; count < w + h; count++) {
			if (wcount == w) {
				result += (h - hcount) * yArray[hcount - 1];
				hcount++;

			} else if (hcount == h) {
				result += (w - wcount) * xArray[wcount - 1];
				wcount++;
			} else if (xArray[wcount] < yArray[hcount]) {
				result += (h - hcount) * xArray[wcount];
				wcount++;
			} else {
				result += (w - wcount) * yArray[hcount];
				hcount++;
			}

		}
		System.out.println(result + xSum + ySum);
		// System.out.println(result);

	}

}
