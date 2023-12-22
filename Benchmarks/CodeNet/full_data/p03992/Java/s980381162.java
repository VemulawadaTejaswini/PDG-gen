import java.util.*;
import java.io.*;
public class Test {// Main
    public static void main(String[] args){
       String Str = new String("CODEFESTIVAL");
       String a = Str.substring(0,4);
       String b = Str.substring(3);
       a = a.concat(" ");
       b = b.concat("\n");
       System.out.println(a.concat(b));
    }
}	