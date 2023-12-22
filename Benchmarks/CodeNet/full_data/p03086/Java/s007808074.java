import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("");
        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if ("A".equals(str[i]) || "C".equals(str[i])
                    || "G".equals(str[i]) || "T".equals(str[i])) {
                count++;
            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }

}
