import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (char c : s.toCharArray()) {
            if (c=='a') countA++;
            if (c=='b') countB++;
            if (c=='c') countC++;
        }
        int diff1 = Math.abs(countA - countB);
        int diff2 = Math.abs(countC - countB);
        int diff3 = Math.abs(countA - countC);
        if (diff1 <= 1 && diff2 <= 1 && diff3 <= 1) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
