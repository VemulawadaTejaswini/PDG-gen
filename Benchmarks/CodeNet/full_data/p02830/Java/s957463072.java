
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        String T = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<N; i++)
        {
            sb.append(S.charAt(i));
            sb.append(T.charAt(i));
        }
        System.out.println(sb);




    }

}














