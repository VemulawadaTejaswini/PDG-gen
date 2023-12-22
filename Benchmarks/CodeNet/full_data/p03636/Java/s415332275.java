
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        String Ans = "";
        Ans = S.substring(1, S.length() - 1);
        S = S.charAt(0) + "" + Ans.length() + "" + S.charAt(S.length() - 1);
        System.out.println(S);
    }
}
