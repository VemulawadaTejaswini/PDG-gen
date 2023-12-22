import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        if(s.equals("AAA") || s.equals("BBB")){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}