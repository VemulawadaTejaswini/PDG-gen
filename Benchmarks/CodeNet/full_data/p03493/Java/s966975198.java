import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int g=0;
        if(n.substring(0,1).equals("1")) {
            g++;
        }
        if(n.substring(1,2).equals("1")) {
            g++;
        }
        if(n.substring(2,3).equals("1")) {
            g++;
        } 
        System.out.println(g);
    }
}
