import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ns = 0;
        int we = 0;

        String str = sc.nextLine();

        for (int i = 0, max = str.length(); i < max; i++) {
            char ch = str.charAt(i);

            if(ch == 'N') {
                ns++;
            } else if (ch == 'W') {
                we--;
            } else if(ch == 'S') {
                ns--;
            } else if(ch == 'E'){
                we++;
            }
        }

        if (ns == 0 && we == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}