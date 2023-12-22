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

			long N =Long.parseLong(br.readLine());
			long A = Long.parseLong(br.readLine());
			long B = Long.parseLong(br.readLine());
			long C = Long.parseLong(br.readLine());
			long D = Long.parseLong(br.readLine());
			long E = Long.parseLong(br.readLine());
			
			long [] ninzu = {A,B,C,D,E};
			long min=Long.parseLong("9999999999999999");
			for(int i=0;i<5;i++) {
				if (ninzu[i]<=min) {
					min=ninzu[i];
				}
			}

			System.out.println(	N/min+ 5);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void init() {
		
	}
}
