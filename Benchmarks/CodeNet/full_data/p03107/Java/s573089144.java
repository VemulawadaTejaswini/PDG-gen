import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] chars = s.toCharArray();
        int numOfZero = 0;
        int numOfOne = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                numOfZero++;
            }
            if (chars[i] == '1') {
                numOfOne++;
            }
        }
        System.out.println(2 * Math.min(numOfOne, numOfZero));
    }

}