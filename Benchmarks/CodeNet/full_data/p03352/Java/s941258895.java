import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
 private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

       int x=Integer.parseInt(scan.nextLine());
       float f=Math.sqrt(x);
       int d= Math.floor(f);
       System.out.println(d*d);


    }
}