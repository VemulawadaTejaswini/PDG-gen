import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        if(s.charAt(0) == 'o') count++;
        if(s.charAt(1) == 'o') count++;
        if(s.charAt(2) == 'o') count++;

        System.out.println(count);

    }
}
