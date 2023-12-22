import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String test = s.substring(0,s.length() / 2);
        String test2 = s.substring(s.length() / 2);
        if(test.equals(test2)){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}