import java.util.*;
import java.io.*;

public class Main {
    public static boolean solve(String s){
        if(s.charAt(0)!='A')return false;
        if(s.charAt(1)=='C'||s.charAt(s.length()-1)=='C') return false;
        int countC = 0;
        for(int i=1;i<s.length();i++){
        	char ith = s.charAt(i);
        	if((ith<'a'||ith>'z')&&ith!='C')return false;
        	if(ith=='C')countC++;
        }
        return countC==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s) ? "AC" : "WA");
    }
}