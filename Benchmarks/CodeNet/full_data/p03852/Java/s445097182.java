import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nex();
        if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}