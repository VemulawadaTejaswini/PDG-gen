import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        double n = scan.nextInt();
        if(n % 2 == 0){
            System.out.print((double) 1 / 2);
        }else{
            System.out.print(((n + 1.0) / 2) / n);
        }
    }
}