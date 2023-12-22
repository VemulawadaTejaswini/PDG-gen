import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <Long> a = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a.add(sc.nextLong());
        }
        List <Long> sum = new ArrayList<>();
        sum.add(a.get(0));
        for(int i = 1;i < n;i++){
            sum.add(sum.get(i-1) + a.get(i));
        }
        long min = 100000000000000L;
        //System.out.println(min);
        for(int i = 0;i < n-1;i++){
            long x = sum.get(i);
            long y = sum.get(n-1) - x;
            //System.out.println("x = " + x);
            //System.out.println("y = " + y);
            long abs = Math.abs(x-y);
            min = Math.min(min,abs);
        }
        System.out.println(min);
    }
}
