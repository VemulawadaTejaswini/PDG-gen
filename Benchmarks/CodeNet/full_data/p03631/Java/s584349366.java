import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        if (x.charAt(0) == x.charAt(2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
