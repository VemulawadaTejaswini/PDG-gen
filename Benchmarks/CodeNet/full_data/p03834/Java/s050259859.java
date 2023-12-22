import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] setu = str.split(",");
        System.out.println(String.format("%s %s %s", setu[0], setu[1], setu[2]));
    }
}