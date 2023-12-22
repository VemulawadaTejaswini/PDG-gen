import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long[] trp = new long[5];
		long n = sc.nextLong();
		
 		trp[0] = sc.nextLong();
 		
		trp[1] = sc.nextLong();
		
		trp[2] = sc.nextLong();
		
		trp[3] = sc.nextLong();
		
		trp[4] = sc.nextLong();
		

		long[] plc = new long[6];
		plc[0] = n;
		plc[1] = 0;
		plc[2] = 0;
		plc[3] = 0;
		plc[4] = 0;
		plc[5] = 0;
		
		long time = 0;
		
		while(plc[5] != n) {
			
			plc[1] =  plc[1] + trp[0];
			
			for(int l = 1; l <= 4; l++) {
				if(plc[l] >= trp[l]) {
					plc[l + 1] = plc[l + 1] + trp[l];
					plc[l] = plc[l] - trp[l];
				}
				else {
					plc[l + 1] = plc[l + 1] + plc[l];
					plc[l] = 0;
				}
			}
			time = time + 1;
		}
		System.out.println(time);
	}
}