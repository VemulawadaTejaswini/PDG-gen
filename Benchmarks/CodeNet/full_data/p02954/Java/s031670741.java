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
        int times = (int)Math.pow(10, 100);
        for(int j = 0; j < times ; j++) {
            for(int i = 0; i < length; i++) {
                int prev, next;
                if(i - 1 > 0 && S[i] == 'R') {
                    prev = V[i-1];
                } else {
                    prev = 0;
                }
                if(i+1 < length && V[i+1] == 'L') {
                    next = V[i+1];
                } else {
                    next = 0;
                }
                copyV[i] = prev + next;
            }
            System.arraycopy(V, 0, copyV, 0, length);
        }

        for(int i = 0; i < length; i++) {
            System.out.print(V[i] + " ");
        }
    }
}
