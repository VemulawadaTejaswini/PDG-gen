import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        long w = sc.nextInt();
        long h = sc.nextInt();
        long x = sc.nextInt();
        long y = sc.nextInt();
        long midx = 0, midy = 0, s = 0;
        int cnt = 0;
        
        midx = w/2;
        midy = h/2;

        if (Math.abs(x - midx) < Math.abs(y - midy)) {
            s = midx * h;
        } else {
            s = w * midy;
        }

        if (Math.abs(x - midx)  == 0 && Math.abs(y - midy) == 0) {
            cnt = 1;
        }

        System.out.println(s+" "+cnt);

		sc.close();
	}
}
