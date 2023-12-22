import  java.io.*;
import  java.math.*;
import  java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
    	String s = cin.next();
    	int flag = 0;
    	if(s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7') flag = 1;
        if(flag == 0) System.out.print("No");
        else System.out.println("Yes");
    }
}