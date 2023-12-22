import java.util.*;

public class Main {
    static final int OFS = 8000;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        char[] as = A.toCharArray();
        char[] bs = B.toCharArray();
        char[] cs = C.toCharArray();
        List<Boolean> failAB, failBC, failCA;
        failAB = new ArrayList<>(16005);
        fillFalse(failAB, 16005);
        failBC = new ArrayList<>(16005);
        fillFalse(failBC, 16005);
        failCA = new ArrayList<>(16005);
        fillFalse(failCA, 16005);
        fillFailArr(as, bs, failAB);
        fillFailArr(bs, cs, failBC);
        fillFailArr(cs, as, failCA);
        int ans = Integer.MAX_VALUE;
        for(int bofs= -4000; bofs<=4000; bofs++){
            for(int cofs = -4000; cofs <= 4000; cofs ++){
                if(!failAB.get(bofs+OFS) && !failCA.get(-cofs+OFS) && !failBC.get(cofs-bofs + OFS)){
                    int L = Math.min(Math.min(0, bofs), cofs);
                    int R = Math.max(Math.max(A.length(), bofs+B.length()), cofs+C.length());
                    ans = Math.min(ans, R-L);
                }
            }
        }
        System.out.println(ans);

    }

    private static void fillFalse(List<Boolean> fail, int size){
        for(int i=0;i<size;i++){
            fail.add(false);
        }
    }

    private static void fillFailArr(char[] a, char[] b, List<Boolean> failAB){
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b.length;j++)
                if(!match(a[i], b[j]))
                    failAB.set(i-j+OFS, true);
    }

    private static boolean match(char a, char b){
        return (a=='?' || b == '?' || a==b);
    }
}
