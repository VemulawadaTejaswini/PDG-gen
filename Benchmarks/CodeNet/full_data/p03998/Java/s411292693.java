import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        String C = scan.next();

        String turn = A;
        boolean flag = true;
        String win = A ;


        while(flag)
            if (turn.length() > 0) {
                switch (turn.charAt(0)) {
                    case 'a':
                        A = A.substring(1);
                        turn = A;
                        win = "A";
                        break;
                    case 'b':
                        B = B.substring(1);
                        turn = B;
                        win = "B";
                        break;
                    case 'c':
                        C = C.substring(1);
                        turn = C;
                        win = "C";
                        break;
                }
            }else {
                System.out.println(win);
                flag = false;
            }
    }
}