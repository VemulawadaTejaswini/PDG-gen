import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int min = -1;
        int result = 0;
        for (int i =0; i<S.length()-2; i++) {
            Integer target = Integer.parseInt(S.substring(i, i+3));
            if (min < 0 || min > Math.abs(753 - target)){
                min = Math.abs(753 - target);
                result = target;
            }
        }

        System.out.println(min);

    }

}