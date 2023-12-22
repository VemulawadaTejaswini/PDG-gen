import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
        
        if(s.charAt(2) == s.charAt(3) && s.charAt(4)==s.charAt(5)){
            System.out.println("Yes");
        }
        System.out.println("No");
    }
}