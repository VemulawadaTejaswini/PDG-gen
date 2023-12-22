
import java.util.Scanner;

public class Main {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		if(h % 3 == 0 || w % 3 == 0) {
			System.out.println(0);
			return;
		}
		long min = (long)h*w;
		int H = h % 2 == 0? h/2 : (h-1)/2;
		for(int i = 1 ; i < w ;i++) {
			long temp = Math.max((long)(w-i)*h,(long)(h-H)*i) - Math.min((long)(w-i)*h,(long)H*i);
			min = Math.min(min, temp);
		}
		
		int W = w % 2 == 0 ? w/2 : (w-1)/2;
		for(int i = 1 ; i < h ;i++) {
			long temp = Math.max((long)(h-i)*w, (long)(w-W)*i) - Math.min((long)(h-i)*w, (long)W*i);
			min = Math.min(temp, min);
		}
		
		System.out.println(min);
	}
}
