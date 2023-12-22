import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        double length = (double)num/3;
        double ans = length*length*length;

        System.out.println(ans);

        
    }
}