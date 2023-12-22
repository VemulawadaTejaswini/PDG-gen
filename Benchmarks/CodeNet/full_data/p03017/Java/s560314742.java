import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();

        s = s.substring(a - 1, Math.max(c,d));

        if (s.contains("##")) {
            System.out.print("No");
        } else {
            if ((b < c && c < d) | c < b) {
                System.out.print("Yes");
            } else if(d < c){
                if (!s.contains("...")) {
                    System.out.print("No");
                } else {
                    if (s.substring(b + 1, d + 1).contains("...")) {
                        System.out.print("Yes");
                    }else{
                        System.out.print("No");
                    }
                }
            }
        }
    }
}