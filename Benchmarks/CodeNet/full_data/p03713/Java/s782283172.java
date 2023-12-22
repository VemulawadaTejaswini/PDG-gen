import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long H = stdIn.nextInt();
		long W = stdIn.nextInt();
		long min = H*W;
		
		for(int i = 1; i < H; i++) {
			long S0 = i*W;
			long S1 = ((H-i)/2)*W;
			long S2 = (H-i-((H-i)/2))*W;
			long S3 = (H-i)*(W/2);
			long S4 = (H-i)*(W-(W/2));
			
			long max1 = Math.max(Math.max(S0,S1),S2);
			long min1 = Math.min(Math.min(S0,S1),S2);
			long max2 = Math.max(Math.max(S0,S3),S4);
			long min2 = Math.min(Math.min(S0,S3),S4);
			
			if(Math.min(max1-min1,max2-min2) < min) min = Math.min(max1-min1,max2-min2);
		}
		for(int i = 1; i < W; i++) {
			long S0 = i*H;
			long S1 = ((W-i)/2)*H;
			long S2 = (W-i-((W-i)/2))*H;
			long S3 = (W-i)*(H/2);
			long S4 = (W-i)*(H-(H/2));
			
			long max1 = Math.max(Math.max(S0,S1),S2);
			long min1 = Math.min(Math.min(S0,S1),S2);
			long max2 = Math.max(Math.max(S0,S3),S4);
			long min2 = Math.min(Math.min(S0,S3),S4);
			
			if(Math.min(max1-min1,max2-min2) < min) min = Math.min(max1-min1,max2-min2);
		}
		
		System.out.println(min);

	}

}