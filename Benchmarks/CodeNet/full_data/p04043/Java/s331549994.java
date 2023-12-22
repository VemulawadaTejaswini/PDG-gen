import java.util.*;

public class Main {
    public static int five = 0;
    public static int seven = 0;
    public static void Main(String[] args) {
        check(args[0].split(" ")[0]);
        check(args[0].split(" ")[1]);
        check(args[0].split(" ")[2]);
        System.out.println(five==2 && seven ==1 ? "YES":"NO");
    }
    public static void check(String str){
        int number = Integer.parseInt(str);
        if(number==5)five++;
        if(number==7)seven++;
    }

}