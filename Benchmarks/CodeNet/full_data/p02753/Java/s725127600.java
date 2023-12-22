import java.util.Scanner;
public class Main {
    public static void main (String...args) {
        Scanner sc = new Scanner(System.in); String S = sc.next(); char[] ch = S.toCharArray();
        System.out.println(ch[0] != ch[1] || ch[1] != ch[2] ? "Yes" : "No");}
}