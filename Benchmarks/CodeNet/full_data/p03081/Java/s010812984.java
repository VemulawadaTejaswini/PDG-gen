import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
    static int[] query;
    static boolean[] isl;
    static String s;
    static int N;
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] tmps = stdR.readLine().split(" ");
        N = Integer.parseInt(tmps[0]);
        int Q = Integer.parseInt(tmps[1]);
        s = stdR.readLine();
        query = new int[Q];
        isl = new boolean[Q];
        for(int i = 0 ; i < Q ; i++) {
            tmps = stdR.readLine().split(" ");
            int place = (int)(tmps[0].toCharArray()[0] - 65);
            query[i] = place;
            if(tmps[1].toCharArray()[0] == 'L') {
                isl[i] = true;
            }else {
                isl[i] = false;
            }
        }
        String[] kouho  = binaryLeftSearch().split(",");
        int[] left = new int[2];
        boolean[] leftbroken = new boolean[2];
        left[0] = Integer.parseInt(kouho[0]);
        left[1] = Integer.parseInt(kouho[1]);
        Arrays.sort(left);
        kouho  = binaryRightSearch().split(",");
        int[] right = new int[2];
        boolean[] rightbroken = new boolean[2];
        right[0] = Integer.parseInt(kouho[0]);
        right[1] = Integer.parseInt(kouho[1]);
        Arrays.sort(right);
        for(int i = 0 ; i < 2 ; i++) {
            if(left[i] >= 0 && left[i] < N && isbroken(left[i], true))leftbroken[i] = true;
            if(right[i] >= 0 && right[i] < N && isbroken(right[i], false))rightbroken[i] = true;
        }
        int leftmost = -1;
        if(leftbroken[1]) {
            leftmost = left[1];
        }else if(leftbroken[0]) {
            leftmost = left[0];
        }
        
        int rightmost = N;
        if(rightbroken[0]) {
            rightmost = right[0];
        }else if(rightbroken[1]) {
            rightmost = right[1];
        }
        
        if(leftmost >= rightmost) {
            System.out.println(0);
        }else {
            System.out.println(N - ((leftmost + 1) + (N - rightmost)));
        }
    }
    
    public static boolean isbroken(int index, boolean leftbroken) {
        for(int i = 0 ; i < query.length ; i++) {
            //System.out.println(i+","+index);
            //System.out.println(query[i]+","+(int)(s.charAt(index) - 65));
            if(query[i] == (int)(s.charAt(index) - 65)) {
                if(isl[i]) {
                    index--;
                    if(index < 0) {
                        if(leftbroken)return true;
                        return false;
                    }
                }else {
                    index++;
                    if(index == s.length()) {
                        if(!leftbroken)return true;
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    public static String binaryLeftSearch() {
        int lower = 0; // 下限
        int upper = N - 1; // 上限
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            //System.out.println(lower+","+upper+","+mid);
            if (isbroken(mid, true)) {
                lower = mid + 1;
            } else {
                upper = mid - 1;
            }
        }
        return lower+","+upper;
    }
    
    public static String binaryRightSearch() {
        int lower = 0; // 下限
        int upper = N - 1; // 上限
        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (isbroken(mid, false)) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return lower+","+upper;
    }
}