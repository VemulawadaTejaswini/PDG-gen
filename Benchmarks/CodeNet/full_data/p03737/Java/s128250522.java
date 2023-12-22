import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        String ans = a.substring(0,1) + b.substring(0,1) +c.substring(0,1);

        System.out.println(ans.toUpperCase());
    }
}
