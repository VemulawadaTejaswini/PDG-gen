
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        ArrayList<String> A = new ArrayList();
        for (int I = 0; I < N; I++) {
            String S = Input.next();
            if (A.contains(S)) {
                A.remove(S);
            } else {
            A.add(S);}
        }
        System.out.println(A.size());
    }
}
