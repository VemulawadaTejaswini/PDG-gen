import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 入出力高速化 java.io.* とthrows IOExceptionを忘れずに
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] S =br.readLine().split(" ") ;
		
		//灰=0、茶=1、緑=2、水=3、青=4、黄=5、橙=6、赤=7
		int[]Rate = new int[8];
		int top = 0;
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(S[i]);
			if(a<=399) {Rate[0]++;}
			if(400<=a && a<=799) {Rate[1]++;}
			if(800<=a && a<=1199) {Rate[2]++;}
			if(1200<=a && a<=1599) {Rate[3]++;}
			if(1600<=a && a<=1999) {Rate[4]++;}
			if(2000<=a && a<=2399) {Rate[5]++;}
			if(2400<=a && a<=2799) {Rate[6]++;}
			if(2800<=a && a<=3199) {Rate[7]++;}
			if(3200<=a) {top++;}
		}
		
		int min = 0;
		int Max = 0;
		
		for(int m=0; m<8; m++) {
			if(Rate[m] != 0) {
				min++;
				Max++;
			}
		}

		Max = min+top;
		if(min == 0) {//全て3200以上
			min++;
		}
		
		System.out.println(min + " " + Max);	
	}
}