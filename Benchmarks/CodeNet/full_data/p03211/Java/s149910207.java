import java.util.Scanner;

public class Main {
    private static final int LOVE_NUMBER = 753;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] sArr = str.split("");
        Integer min = null;
        for (int i = 0; i < str.length() - 2; i++) {
            Integer num = Integer.parseInt(sArr[i] + sArr[i + 1] + sArr[i + 2]);
            if (i == 0 || min > Math.abs(LOVE_NUMBER - num)) {
                min = Math.abs(LOVE_NUMBER - num);
            }
        }
        System.out.println(min);
    }
}
