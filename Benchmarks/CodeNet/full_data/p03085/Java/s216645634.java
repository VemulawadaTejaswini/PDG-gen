import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch (a) {
            case "A":
                System.out.println("T");
            case "T":
                System.out.println("A");
            case "G":
                System.out.println("C");
            case "C":
                System.out.println("G");
        }
    }
}
