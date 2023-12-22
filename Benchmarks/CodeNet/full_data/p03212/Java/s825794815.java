import java.util.*;
 
public class Main {
	
  static int count_753(int n, int lim){
        if(n > lim) return 0;
        
        int tmp = n;
        boolean thr = false, fiv = false, svn = false;
        while(tmp > 0){
            int chr = tmp % 10;
            if(chr == 3) thr = true;
            if(chr == 5) fiv = true;
            if(chr == 7) svn = true;
            tmp /= 10;
        }
        
        int result = 0;
        if(thr && fiv && svn) result++;

        if(n * 10 < lim){
            result += count_753(n * 10 + 3, lim);
            result += count_753(n * 10 + 5, lim);
            result += count_753(n * 10 + 7, lim);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        System.out.println(count_753(0, N));
    }
}