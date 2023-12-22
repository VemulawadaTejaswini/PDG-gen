import java.util.*;

public class Main {
    public static void main(String[] args){
        String s = new Scanner(System.in).next();
        System.out.println(s.split("")[0] + (s.length() - 2) + s.split("")[s.length()-1]);
    }
}