import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int A = Integer.parseInt(br.readLine());
			int B = Integer.parseInt(br.readLine());
			int C = Integer.parseInt(br.readLine());
			int D = Integer.parseInt(br.readLine());
			int E = Integer.parseInt(br.readLine());
			
			int[] full = {A,B,C,D,E};
			int[] keta1 = {A%10,B%10,C%10,D%10,E%10};
			int min = 9;
			int minIndex=0;
			for (int i=0;i<5;i++) {
				if (0<keta1[i] && keta1[i] < min) {
					min=keta1[i];
					minIndex=i;
				}
			}
			int sum=0;
			for (int i=0;i<5;i++) {
				if (i!=minIndex) {
					if (full[i]%10 == 0) {
						sum=sum+full[i];
					} else {
						sum=sum+(full[i]/10+1)*10;	
					}
				} else {
					sum=sum+full[i];
                  
				}
			}

			
			
			System.out.println(	sum);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void init() {
		
	}
}
