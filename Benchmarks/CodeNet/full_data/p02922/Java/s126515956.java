import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = (sc.nextInt() - 1);
        int b = (sc.nextInt() - 1);
        int result = b / a;
        System.out.println(result);
        sc.close();
    }
}