
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int x = N+M;
        int z = N*M;

        int a = (x*(x-1))/2 - z;
        System.out.println(a);



 }

    }


    





