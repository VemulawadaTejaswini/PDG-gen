import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        in.close();
        String dis = text.contains("N") && contains("S") && contains("W") && contains("E")
                ? "Yes" : "No";
        System.out.println(dis);
    }
}