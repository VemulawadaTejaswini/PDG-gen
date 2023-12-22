import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
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
