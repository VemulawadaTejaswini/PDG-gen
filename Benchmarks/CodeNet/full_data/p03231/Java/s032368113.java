import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        String smallStr, largeStr;
        int small, large;
        if(n <= m) {
            small = n;
            large = m;
            smallStr = s;
            largeStr = t;
        } else {
            small = m;
            large = n;
            smallStr = t;
            largeStr = s;
        }
        int minLength = (large * small) / gdc(large, small);
        int num = 1;
//        while(minLength <= Math.pow(10, 5)) {
            int sZutsu = minLength / large;
            int lZutsu = minLength / small;
            int i = 0, j = 0;
//            int index = (minLength/small * minLength/large / gdc(minLength/small, minLength/large));
            while(j < small && i < large && largeStr.charAt(i) == smallStr.charAt(j)) {
                j += sZutsu;
                i += lZutsu;
                if(j >= small || i >= large) {
                    System.out.println(minLength);
                    return;
                }
//                System.out.println("i: " + i);
//                System.out.println("j: " + j);
//                System.out.println("char at i: " + largeStr.charAt(i));
//                System.out.println("char at j: " + smallStr.charAt(j));
            }
//            num++;
//            minLength *= num;
//        }
        System.out.println(-1);
    }

    static int gdc(int large, int small) {
        int r;
        while((r = large % small) != 0) {
            large = small;
            small = r;
        }
        return small;
    }
}
