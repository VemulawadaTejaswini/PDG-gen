// Why do we fall ? So we can learn to pick ourselves up.
import java.util.*;
public class solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();
        long n = s.length;
        if (n == 1) {
            if (k == 1) {
                System.out.println(0);
            } else {
                System.out.println(k/2);
            }
        } else {
                ArrayList<Long> aa = new ArrayList<>();
                long i = 0;
                long ss = 0L;
                while (true) {
                    if (i == n) {
                        break;
                    }
                    char curr = s[(int)i];
                    long temp = 1L;
                    i += 1;
                    if (i == n) {
                        break;
                    }
                    while (s[(int) i] == curr) {
                        temp += 1;
                        i += 1;
                        if (i == n) {
                            break;
                        }
                    }
                    aa.add(temp);

                }
                if(aa.size() > 1){
                    for (Long aLong : aa) {
                        ss += (aLong / 2L) * k;
                    }
                    if(s[0] == (s[(int) (n-1)]) && aa.get(0) %2 == 1 && aa.get(aa.size()-1)%2 == 1){
                        ss += k-1;
                    }
                } else {
                    ss += (n*k)/2L;
                }
                System.out.println(ss);
        }
    }
}