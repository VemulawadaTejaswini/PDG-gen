import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        if((double)n / 1.08 % 1 == 0){
            System.out.println(n / 1.08);
            return;
        }
        for(int i =(int) (n / 1.08); i <= n; i++){
            if((int) (i * 1.08) == n){
                System.out.println((int) i);
                return;
            }
        }
        System.out.println(":(");
        scan.close();
    }
}