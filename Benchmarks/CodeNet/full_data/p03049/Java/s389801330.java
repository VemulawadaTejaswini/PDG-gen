import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean xbANDa = false;
        boolean bANDxa = false;
        int acount = 0;
        int bcount = 0;
        int abcount = 0;
        
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.charAt(0) != 'B' && str.charAt(str.length() - 1) == 'A') {
                acount++;
                xbANDa = true;
            }
            if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) != 'A') {
                bcount++;
                bANDxa = true;
            }
            if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) == 'A') {
                acount++;
                bcount++;
            }
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == 'A' && str.charAt(j + 1) == 'B') {
                    abcount++;
                }
            }
        }
        
        int count = 0;
        if (xbANDa || bANDxa) {
            count = Math.min(acount, bcount);
        } else {
            count = acount - 1;
        }
        
        System.out.println(count + abcount);
    }
}
