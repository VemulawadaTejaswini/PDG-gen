import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)) System.out.println("Yes");
        else System.out.println("No");
    }
}