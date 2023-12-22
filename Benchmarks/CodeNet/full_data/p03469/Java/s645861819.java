import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        char[] c = s.toCharArray();

        c[3]='8';
        System.out.println(c);
    }

}
