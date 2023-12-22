import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        String temp = kbd.next();
        String[] arr = temp.split("");
        int countR = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("R")) {
                countR++;
            } else {
                countB++;
            }
        }
        if (countR > countB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}