import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        String k="2019/04/30";
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        if(s.contains("2019"))
        {
        if(s.contains("/04/30"))
        {
            System.out.println("Heisei");
        }
        else
        {
            System.out.println("TBD");
        }
        }
    }
}
