import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a != 1 && b != 1){
            System.out.println("1");
        }else if(a != 2 && b != 2){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
    }
}