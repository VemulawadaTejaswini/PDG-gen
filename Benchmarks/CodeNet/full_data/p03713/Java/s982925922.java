import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        long r = Long.MAX_VALUE;

        // 2つの線を平行にする
        if(h>=3) {
            if(h%3==0) {
                r = 0;
            }
            else {
                r = w;
            }
        }
        if(w>=3) {
            if(w%3==0) {
                r = 0;
            }
            else {
                r = Math.min(r, h);
            }
        }

        // 入力例2の形：まず縦に切って、大きい方をさらに2つに切る
        for(int i=1; i<=w-1; i++) {
            long s1 = i*h;
            long s2 = (w-i)*(long)Math.floor(h/2.0);
            long s3 = (w-i)*(long)Math.ceil(h/2.0);
            long smax = Math.max(s1, Math.max(s2, s3));
            long smin = Math.min(s1, Math.min(s2, s3));
            r = Math.min(r, smax - smin);
        }
        // 入力例3の形：まず横に切って、大きい方をさらに2つに切る
        for(int i=1; i<=h-1; i++) {
            long s1 = i*w;
            long s2 = (h-i)*(int)Math.floor(w/2.0);
            long s3 = (h-i)*(int)Math.ceil(w/2.0);
            long smax = Math.max(s1, Math.max(s2, s3));
            long smin = Math.min(s1, Math.min(s2, s3));
            r = Math.min(r, smax - smin);
        }
        System.out.println(r);
    }
}
