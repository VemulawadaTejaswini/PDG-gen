import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        long k = scan.nextLong();
        if(s.charAt(0) == '1') System.out.println(s.charAt(1));
        else System.out.println(s.charAt(0));
        scan.close();
    }
}