import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oldDate= sc.next();
        System.out.println(oldDate.replaceFirst("2017","2018"));
    }
}