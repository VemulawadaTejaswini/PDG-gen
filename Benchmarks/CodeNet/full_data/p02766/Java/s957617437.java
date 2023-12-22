import java.util.Scanner;

public class Main {

    public static String converter(String number, int base, int dest){
        return Integer.toString(Integer.parseInt(number, base), dest);
    }

    private static int converter(String number, int dest){
        return converter(number, 10, dest).length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int dest = scanner.nextInt();
        System.out.println(converter(s, dest));
    }
}