import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int maxlength = 0;
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if (containACGT(a.charAt(i))) {
                count++;
                if (maxlength < count) {
                    maxlength = count;
                }
                continue;
            }
            count = 0;
        }
        System.out.println(maxlength);
    }

    private static Boolean containACGT(char c) {
        if (Arrays.stream("ACGT".split("")).anyMatch(s -> s.contains(Character.toString(c)))) {
            return true;
        }
        return false;
    }
}
