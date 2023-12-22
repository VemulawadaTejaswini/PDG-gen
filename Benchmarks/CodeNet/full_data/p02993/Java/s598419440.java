import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String e = scan.next();
        char a = e.charAt(0);
        char b = e.charAt(1);
        char c = e.charAt(2);
        char d = e.charAt(3);
        if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}