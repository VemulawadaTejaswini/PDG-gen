import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.contains("AB") || a.contains("BA"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
