import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        ArrayList<String> strs = new ArrayList<String>(Arrays.asList("SUN","MON","TUE","WED","THU","FRI","SAT"));
        System.out.println(7-strs.indexOf(a));
    }
}

