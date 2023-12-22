import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = S.length()-1;
        int counter = 0;
        while (a<=b) {
            if (S.charAt(a)!=S.charAt(b))
                counter++;
            a++;
            b--;
        }
        System.out.println(counter);
    }
}
