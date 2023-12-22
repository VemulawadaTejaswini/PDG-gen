import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long x=in.nextLong();
        String s=in.next();
        String[]e=s.split("ABC");
        System.out.println(e.length-1);
    }
}
