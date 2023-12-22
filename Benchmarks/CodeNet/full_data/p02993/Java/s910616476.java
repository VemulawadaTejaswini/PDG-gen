import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = ' ';
        for(char cc : s.toCharArray()) {
            if(c != cc) {
                c = cc;
            } else {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}