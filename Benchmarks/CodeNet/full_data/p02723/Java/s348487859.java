import java.util.*;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char[] coffee = "coffee".toCharArray;
        char[] S = sc.next().toCharArray();

        if (S[2] == S[3] && S[4] == S[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
