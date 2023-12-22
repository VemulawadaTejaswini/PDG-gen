

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static boolean ispf = false;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		int provinceCount = Integer.parseInt(systemInLine[0]);
		int cityCount = Integer.parseInt(systemInLine[1]);
		pf("辖区总数:" + provinceCount + " 城市总数:" + cityCount);

		
		/**
		 * 所有的城市
		 */
		
		//城市数组，0：省份，1：年份，2：输入顺序号，4：年份序号
		int[][]  proviceCityArray = new int[cityCount][4];

		for (int i = 0; i < cityCount; i++) {
			systemInLine = br.readLine().split(" ");
			int provinceIndex = Integer.parseInt(systemInLine[0]);
			int cityCreateYear = Integer.parseInt(systemInLine[1]);
			proviceCityArray[i][0]= provinceIndex;
			proviceCityArray[i][1]= cityCreateYear;
			proviceCityArray[i][2]= i+1;
		}
		br.close();
		
		
		
		/**
		 * 这次排序后辖区和年份已经排序了
		 */
	
		Arrays.sort(proviceCityArray,(o1, o2) -> (o1[0] == o2[0]) ? (o1[1] - o2[1]) : (o1[0] - o2[0]));
		
		for (int i = 0; i < proviceCityArray.length; i++) {
			if(i==0) {
				proviceCityArray[i][3] = 1;
			}else {
				if((proviceCityArray[i][0] == proviceCityArray[i - 1][0])) {//于上一次比较
					proviceCityArray[i][3] = proviceCityArray[i - 1][3] + 1;
				}else {
					proviceCityArray[i][3] = 1;
				}
			}
		}
		
		/**
		 * 再次排序拍会回来
		 */
		 Arrays.sort(proviceCityArray, (o1, o2) -> o1[2] - o2[2]);
		 String[] padding = new String[]{"", "0", "00", "000", "0000", "00000"};
		for (int i = 0; i < proviceCityArray.length; i++) {
			//System.out.println(String.format("%06d", proviceCityArray[i][0])+String.format("%06d", proviceCityArray[i][3]));
			System.out.println(
					padding[getPadingIndex(proviceCityArray[i][0])]+proviceCityArray[i][0]+
					        padding[getPadingIndex(proviceCityArray[i][3])]+proviceCityArray[i][3]);
		}
		
	}

	public static void pf(String s) {
		if (ispf) {
			System.out.println(s);
		}
	}
	 private static int getPadingIndex(int n) {
	        if (n < 10) return 5;
	        else if (n < 100) return 4;
	        else if (n < 1000) return 3;
	        else if (n < 10000) return 2;
	        else if (n < 100000) return 1;
	        else return 0;
	    }
}
