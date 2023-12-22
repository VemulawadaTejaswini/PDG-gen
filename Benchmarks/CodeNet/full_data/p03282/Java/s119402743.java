import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        if(s.length() == 1) {
            System.out.println(s);
            return;
        }
        String one = s.substring(0, 1);
        String two = s.substring(1, 2);
        if(!one.equals("1")) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }
    }
}