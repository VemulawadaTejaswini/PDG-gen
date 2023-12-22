public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && a != c) {
            System.out.println("Yes");
        }
        else if (a == c && a != b) {
            System.out.println("Yes");
        }
        else if (b == c && a != b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}