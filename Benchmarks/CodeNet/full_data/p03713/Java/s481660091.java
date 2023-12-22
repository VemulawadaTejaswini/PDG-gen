import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong(),w = sc.nextLong();
		long s1 = 0, s2 = 0, s3 = 0;
		long min = Long.MAX_VALUE;
		for (int i = 1; i < w; i++) {
			s1 = i*h;
			s2 = h/2*(w-i);
			s3 = (h+1)/2*(w-i);
			min = Math.min(min, Math.max(Math.max(s1,s2),s3)-Math.min(Math.min(s1,s2),s3));
			s2 = (w-i)/2*h;
			s3 = (w-i+1)/2*h;
			min = Math.min(min, Math.max(Math.max(s1,s2),s3)-Math.min(Math.min(s1,s2),s3));
		}
		for (int i = 1; i < h; i++) {
			s1 = i*w;
			s2 = w/2*(h-i);
			s3 = (w+1)/2*(h-i);
			min = Math.min(min, Math.max(Math.max(s1,s2),s3)-Math.min(Math.min(s1,s2),s3));
			s2 = (h-i)/2*w;
			s3 = (h-i+1)/2*w;
			min = Math.min(min, Math.max(Math.max(s1,s2),s3)-Math.min(Math.min(s1,s2),s3));
		}
		System.out.println(min);
		sc.close();
	}
}