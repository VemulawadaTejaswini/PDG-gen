import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static HashMap<String,Integer>dp;
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.replace(0,4,"2018"));
    }
}




