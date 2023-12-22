
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();
        if(A<10&&B<10)
        System.out.println(A*B);
        else
        System.out.println(-1);
    }
}