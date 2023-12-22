import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a = a.replaceAll("1", "2");
        a = a.replaceAll("9", "3");
        a = a.replaceAll("2", "9");
       a =  a.replaceAll("3", "1");
        System.out.println(a);
    }

}