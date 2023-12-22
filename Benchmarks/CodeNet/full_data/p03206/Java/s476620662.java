import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String res = "";

        switch (d) {
            case 25:
                res = "Christmas";
                break;
            case 24:
                res = "Christmas Eve";
                break;
            case 23:
                res = "Christmas Eve Eve";
                break;
            case 22:
                res = "Christmas Eve Eve Eve";
                break;
            default:
        }

        System.out.println(res);
    }
}
