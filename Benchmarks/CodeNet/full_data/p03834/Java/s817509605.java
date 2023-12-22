import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        String ans = a.substring(0,5)+" "+a.substring(6,13) + " " +a.substring(14);

        System.out.println(ans);
    }
}
