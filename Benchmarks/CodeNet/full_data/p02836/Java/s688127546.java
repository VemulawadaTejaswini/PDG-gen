import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        int count = 0;
        for (int i = 0, j = s.length-1; i < s.length/2; i++, j--) {
            if (!s[i].equals(s[j])) {
                count++;
            }
        }
        System.out.println(count);
    }
}