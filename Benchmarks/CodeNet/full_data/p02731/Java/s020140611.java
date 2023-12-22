import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long length = num/3;
        long ans = length*length*length;

        System.out.println(ans);

        
    }
}