import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        char c=' ';

        if(scan.hasNext())
            c=scan.next().charAt(0);
        System.out.println((char)(c+1));
    }
}
