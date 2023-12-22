import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr = sc.next().toCharArray();

        Arrays.sort(charArr);

        if (charArr[charArr.length-1] == 'z') {
            System.out.println("None");
        } else {
            char cur = 'a';
            for (int i = 0; i < charArr.length; i++) {
                if (charArr[i] == cur) {
                    cur++;
                } else if (charArr[i] == charArr[i-1]) {
                  continue;
                } else {
                    break;
                }
            }

            System.out.println(cur);
        }
    }
}
