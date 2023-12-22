import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if(!s.equals("AAA")&&!s.equals("BBB")){
            System.out.println("yes");
            return;
        }
        System.out.println("No");
    }
}