import java.lang.String;
import java.lang.System;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String text = cin.next();
        String sub = text.substring(0, 4);
        String remainder = text.substring(4);
        System.out.println(sub+" "+remainder);
    }
}