import java.util.*;

public class Main {
    public static int five = 0;
    public static int seven = 0;
    public static void main(String[] args) {
        String[] inputs = sc.next().split(" ");
        check(args[0]);
        check(args[1]);
        check(args[2]);
        System.out.println(five==2 && seven ==1 ? "YES":"NO");
    }
    public static void check(String str){
        int number = Integer.parseInt(str);
        if(number==5)five++;
        if(number==7)seven++;
    }

}