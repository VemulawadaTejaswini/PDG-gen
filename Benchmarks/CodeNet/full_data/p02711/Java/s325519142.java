


import java.util.Scanner;

public class MainA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = Integer.toString(n);
        if (s.charAt(0) == '7') {
            System.out.println("Yes");
        } else if (s.charAt(1) == '7') {
            System.out.println("Yes");
        } else if (s.charAt(2) == '7') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
