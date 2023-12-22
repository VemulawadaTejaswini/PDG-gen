import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Main {
    public static void main(String[] args) throws IOException {
       try{
           Scanner sc=new Scanner(System.in);
           String s=sc.nextLine();
           if((s.charAt(2)==s.charAt(3)) && (s.charAt(4)==s.charAt(5)))
           System.out.println("Yes");
           else
           System.out.println("No");
       }
       catch(Exception e)
       {
           return;
       }
    }
}
