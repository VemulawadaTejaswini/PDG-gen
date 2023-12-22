import java.util.*;

public class Main
{
    public static void main(String... args){
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(solve(c));
    }
    public static int solve(int c){
        int min_step = (int) ((-1 + Math.sqrt(1 + 8*c) ) / 2);
        if (min_step * (min_step + 1) < 2 * c){
            min_step += 1;
        }
//        while ((min_step * (min_step - 1) / 2 - c) % 2 != 0){
//            min_step += 1;
//        }
//        int remain = (min_step * (min_step - 1) / 2 - c);
        return min_step;
    }


}