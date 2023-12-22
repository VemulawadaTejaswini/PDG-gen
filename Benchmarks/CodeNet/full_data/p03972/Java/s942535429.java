import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] wh = reader.readLine().split(" ",0);
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);

		int[] costX = new int[w];
		int[] costY = new int[h];

		for(int i = 0; i < w; i++) {
			costX[i] = Integer.parseInt(reader.readLine());
		}
		for(int i = 0; i < h; i++) {
			costY[i] = Integer.parseInt(reader.readLine());
		}

		Arrays.sort(costX);
		Arrays.sort(costY);

		int wIndex = 0;
		int hIndex = 0;

		int result = 0;

		for(int loop = 0; loop < w+h; loop++) {
			if(wIndex>=costX.length && hIndex>=costY.length) break;
			if(wIndex>=costX.length || costX[wIndex] > costY[hIndex]) {
				result += costY[hIndex] * (w-wIndex+1);
				hIndex++;
			}else {
				result += costX[wIndex] * (h-hIndex+1);
				wIndex++;
			}
			//System.out.println(result);
		}

		System.out.println(result);
	}
}
