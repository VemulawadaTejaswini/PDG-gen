import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long min = Long.MAX_VALUE;
        int cnt = 0;

        for(long i = l; i<r; i++) {
            for(long j = i+1; j<=r; j++) {
                cnt++;
                if(cnt>=2019) break;
                min = Math.min(((long)i*(long)j)%2019, min);
            }
            if(cnt>=2019) break;
        }
        System.out.println(min);
    }
}