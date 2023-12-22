import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean humi = true;
        String s = sc.next();
        String[] sArray = s.split("");
        for (int i = 0; i < sArray.length; i++) {
            if ((i + 1) % 2 == 0) {
                if ((sArray[i].equals("L")) || (sArray[i].equals("U")) || (sArray[i].equals("D"))) {
                } else {
                    humi = false;
                }
            } else {
                if ((sArray[i].equals("R")) || (sArray[i].equals("U")) || (sArray[i].equals("D"))) {
                } else {
                    humi = false;
                }
            }
            if (!humi)
                break;
        }
        if (humi) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}