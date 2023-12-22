import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        sc.close();
        if(x >= 0 && y >= 0){
            if(x > y){
                System.out.println(x - y + 2);
            }else{
                System.out.println(y - x);
            }
        }else if(x > 0 && y < 0){
            System.out.println(Math.abs(x + y) + 1);
        }else if(x < 0 && y > 0){
            System.out.println(Math.abs(x + y) + 1);
        }else{
            if(x > y){
                System.out.println(x - y + 2);
            }else{
                System.out.println(y - x);
            }
        }
    }
}