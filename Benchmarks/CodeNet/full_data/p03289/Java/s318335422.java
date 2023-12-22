import java.util.Scanner;

class Main {
    static final Scanner IN = new Scanner(System.in);
    static final String S = IN.next();
    public static void main(String... args) {
        if (S.matches("A[a-z]+C[a-z]+")) {
            puts("AC");
        } else {
            puts("WA");
        }
    }
    static <T> void puts(T arg) { System.out.println(arg);}
}