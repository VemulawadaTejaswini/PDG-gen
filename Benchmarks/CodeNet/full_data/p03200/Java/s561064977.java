import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] chars = S.toCharArray();
        int[] stones = new int[chars.length];
        for(int i=0; i<chars.length-1; i++) {
            if(chars[i] == 'B') {
              stones[i] = 0;
            } else {
              stones[i] = 1;
            }
        }
        int max = 0;
        while(true) {
            int currentMax = max;
            for(int i=0; i<chars.length-1; i++) {
                if(stones[i] == 0 && stones[i+1] == 1) {
                    max ++ ;
                    stones[i] = 1;
                    stones[i+1] = 0;
                }else if(stones[i] == 1 && stones[i+1] == 0) {
                    i++;
                }
            }
            if (currentMax == max) {
                break;
            }
        }
        System.out.println(max);
    }
}
