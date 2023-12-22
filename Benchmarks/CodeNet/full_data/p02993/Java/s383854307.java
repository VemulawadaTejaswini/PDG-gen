import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char c ='a';
                char pre='a';
        for(int i = 0; i<4; i++) {
            pre = c;
            c = n.charAt(i);
            if(pre == c) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}