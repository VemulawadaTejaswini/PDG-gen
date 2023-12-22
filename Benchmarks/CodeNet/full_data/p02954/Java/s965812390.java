import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int streakLeft = 0;
        int streakRight = 0;
        int firstL = 0;
        int[] result = new int[len];
        for(int i=0; i<len; i++) {
            char c = s.charAt(i);
            char next = (i==len-1 ? 'R' : s.charAt(i+1));
            if(c=='R' && next=='L') {
                firstL = i+1;
            }
            if(c=='L' && next=='R') {
                streakRight = i;
                parseStreak(s, streakLeft, streakRight, firstL, result);
                streakLeft = i+1;
            }
        }
        for(int i=0; i<len-1; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
        System.out.println(result[len-1]);
    }
    private static void parseStreak(String s, int streakLeft, int streakRight, int firstL, int[] result) {
        int streakLength = streakRight - streakLeft + 1;
        int even = streakLength / 2; // round down
        int odd = even + (streakLength%2 == 1 ? 1 : 0);
        int r = even;
        int l = odd;
        if((firstL - streakLeft) % 2 == 1) {
            r = odd;
            l = even;
        }
        for(int i=streakLeft; i<=streakRight; i++) {
            if(i==firstL-1) {
                result[i] = r;
            }
            else if(i==firstL) {
                result[i] = l;
            }
            else {
                result[i] = 0;
            }
        }
    }
}
