import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if(search(S)) System.out.println("Bad");
        else System.out.println("Good");
        sc.close();
    }

    static boolean search(String s) {
        for(int i = 1; i < 4; i++) {
            char a = s.charAt(i-1);
            char b = s.charAt(i);
            if(a == b) return true;
        }
        return false;
    }
}