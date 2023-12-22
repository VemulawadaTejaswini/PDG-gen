import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;

        sum +=Math.min(a,b);
        sum +=Math.min(c,d);
        System.out.println(sum);

    }

}
