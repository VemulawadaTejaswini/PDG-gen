import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double t = sc.nextInt();
        int sum = 0;
        int time = a;

        while( time < t+0.5){
            sum +=b;
            time += a;
            
        }
        System.out.println(sum);
    }

}
