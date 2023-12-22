import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String word = sc.next();

        System.out.println(1 + (word.lastIndexOf("Z")) - (word.indexOf("A")));
    }
}