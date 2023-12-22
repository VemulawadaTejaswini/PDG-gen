import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n != 100){
            System.out.print(n*Math.pow(100,d));
        } else {
            System.out.print(101*Math.pow(100,d));
        }
    }
}