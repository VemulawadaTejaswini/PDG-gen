import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        int cnt = 0;
        for (String operand : a) {
            switch (operand) {
                case "+": cnt++;
                    break;
                case "-": cnt--;
                    break;
            }
        }
        System.out.println(cnt);
    }
}
