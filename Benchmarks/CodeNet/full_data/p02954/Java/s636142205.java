import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        char[] S = string.toCharArray();
        Integer length = string.length();
        int[] V = new int[length];
        int[] copyV = new int[length];
        Arrays.fill(V, 1);
        char prevChar = S[0];
        int times = 1;
        int maxTimes = 0;
        for(int i = 1; i < length; i++) {
            if(prevChar == S[i]) {
                times++;
                if(times > maxTimes)
                    maxTimes = times;
            } else {
                prevChar = S[i];
                times = 1;
            }
        }
        times = maxTimes;

        if(times % 2 == 1)
         times = times + 1;

        for(int j = 0; j < times ; j++) {
            for(int i = 0; i < length; i++) {
                int prev, next;
                if(i - 1 >= 0 && S[i-1] == 'R') {
                    prev = V[i-1];
                } else {
                    prev = 0;
                }
                if(i+1 < length && S[i+1] == 'L') {
                    next = V[i+1];
                } else {
                    next = 0;
                }
                copyV[i] = prev + next;
            }
            System.arraycopy(copyV, 0, V, 0, length);
        }

        for(int i = 0; i < length; i++) {
            System.out.print(V[i] + " ");
        }
    }
}
