import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String station = sc.next();
        char[] s = new char[3];
        String word = "No";

        for (int i = 0; i < 3; i++) {
            s[i] = station.charAt(i);
            if (i !=0 && s[i - 1] != s[i])
                word = "Yes";
        }

        System.out.println(word);


    }
}
