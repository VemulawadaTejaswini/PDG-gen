import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String o = scan.next();
        String e = scan.next();
        for(int i = 0; i < o.length(); i++){
            System.out.print(o.charAt(i));
            System.out.print(e.charAt(i));
        }
    }
}