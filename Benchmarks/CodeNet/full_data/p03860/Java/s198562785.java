import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        s = input.nextLine();
        if (null != s) switch (s) {
            case "AtCoder Beginner Contest":
                System.out.println("ABC");
                System.out.println("The contest in which you are participating now.");
                break;
            case "AtCoder Snuke Contest":
                System.out.println("ASC");
                System.out.println("The contest does not actually exist.");
                break;
            case "AtCoder X Contest":
                System.out.println("AXC");
                break;
        }

    }
}
