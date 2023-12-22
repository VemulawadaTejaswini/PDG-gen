
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean KYS(String S) {
        ArrayList<String> A = new ArrayList();
        for (int I = 0; I < S.length(); I++) {
            if (!A.contains(S.charAt(I) + "")) {
                A.add(S.charAt(I) + "");
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        boolean B = KYS(S);
        if (B) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

//Learn Before You Earn
