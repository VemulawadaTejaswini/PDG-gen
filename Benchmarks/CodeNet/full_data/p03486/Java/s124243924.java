import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = (sc.next()).toCharArray();
        char[] t = (sc.next()).toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);

        boolean isAns = false;
        for (int i = 0; i < s.length; i++) {
            int tNum = t.length - i;
            if (s[i] < t[tNum-1]) {
                isAns = true;
                break;
            }
        }
      	
      	if (!(isAns) && s.length < t.length)
            isAns = true;

        System.out.println(isAns ? "Yes" : "No");
    }
}
