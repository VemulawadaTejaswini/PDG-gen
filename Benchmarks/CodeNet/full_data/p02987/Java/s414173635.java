import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] str = new String[4];
        str = s.split("");
        if (str[0].equals(str[1])) {
            if (str[2].equals(str[3]))
                System.out.println("Yes");
        } else if (str[0].equals(str[2])) {
            if (str[1].equals(str[3]))
                System.out.println("Yes");
        } else if (str[0].equals(str[3])) {
            if (str[1].equals(str[2]))
                System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}