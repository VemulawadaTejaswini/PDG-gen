import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        while(s.contains("B")){
            s = s.replaceAll("^B|[01]B", "");
        }
        System.out.println(s);
    }
}
