import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String N = stdIn.next();
        if (N.charAt(0) == N.charAt(1) || N.charAt(1) == N.charAt(2) || N.charAt(2) == N.charAt(3))
            System.out.print("Bad");
        else
            System.out.print("Good");
    }
}