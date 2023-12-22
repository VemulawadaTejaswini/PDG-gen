
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String k = sc.next();

        String a = k.substring(0,1);
        String b = k.substring(1,2);
        String c = k.substring(2,3);
        String d = k.substring(3,4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        Boolean g;

        if(a.equals(b)){
            g = true;
        }else if(b.equals(c)){
            g = true;
        }else if(c.equals(d)){
            g = true;
        }else{
            g = false;
        }

        if(g){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }


    }
}