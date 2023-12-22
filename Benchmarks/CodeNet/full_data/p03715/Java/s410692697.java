
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		long h = sc.nextInt();
		long w = sc.nextInt();

		if(h%3 == 0 || w%3 == 0){
			System.out.println(0);
			return;
		}

//		if(h > w){
//			int tmp = h;
//			h = w;
//			w = tmp;
//		}

		long result = Long.MAX_VALUE;

		for(int i = 1; i <= h; i++){
			long area1 = (long)i*w;

			long h2 = h - i;
			long w2 = w;

			long area2;

			if(h2 % 2 == 0 || w2 % 2 == 0){
				area2 = h2*w2/2;
			}
			else {
				area2 = Math.max(h2, w2)/2*Math.min(h2, w2);
			}
			long area3 = h*w - area1 - area2;

//			if(i >= 32000 && i <= 34000)System.out.println("h1 = "+i+" "+area1+" "+area2 + " "+area3);

			long maxArea = Math.max(area1, Math.max(area2, area3));
			long minArea = Math.min(area1, Math.min(area2, area3));

			result = Math.min(maxArea - minArea, result);
		}

		for(int i = 1; i <= w; i++){
			long area1 = (long)i*h;

			long h2 = h;
			long w2 = w - i;

			long area2;
			if(h2 % 2 == 0 || w2 % 2 == 0){
				area2 = h2*w2/2;
			}
			else {
				area2 = Math.max(h2, w2)/2*Math.min(h2, w2);
			}
			long area3 = h*w - area1 - area2;

//			System.out.println("w1 = "+i+" "+area1+" "+area2 + " "+area3);

			long maxArea = Math.max(area1, Math.max(area2, area3));
			long minArea = Math.min(area1, Math.min(area2, area3));

			result = Math.min(maxArea - minArea, result);
		}


		System.out.println(result);
	}

}
