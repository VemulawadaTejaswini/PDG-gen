import java.util.*;
public class Main{
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int length = a.length();

        String afterA = a;

        for(int i=0; i<length; i++){
            char charA = afterA.charAt(length-1);
            afterA = charA + afterA.substring(0,length-1);
            if(afterA.equals(b)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
