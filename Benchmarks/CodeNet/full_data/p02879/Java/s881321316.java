import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<10 && b<10)
            System.out.println(a*b);
        else
            System.out.println("-1");

    }
}
