import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1200)
            System.out.println("ABC");
        else
            System.out.println("ARC");
    }
}
