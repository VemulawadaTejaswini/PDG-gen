import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        switch (sc.next()) {
        case "A":
            result = "T";
            break;
        case "C":
            result = "G";
            break;
        case "G":
            result = "C";
            break;
        default:
            // "T"
            result = "A";
            break;
        }
        System.out.println(result);
    }
}