import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;
        int i = 0;
        for(i = 1; c < b; i++){
                c = a * i + a - i;
        }
        if(b % a == 0){
            System.out.println(i - 1);
        }else{
            System.out.println(i);
        }
    }
}