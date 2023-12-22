import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long ans=cin.nextLong();
        long c=(long) (ans/500);
        long t=(long)(ans%500)/5;
        System.out.println(c*1000+t*5);
    }
}
