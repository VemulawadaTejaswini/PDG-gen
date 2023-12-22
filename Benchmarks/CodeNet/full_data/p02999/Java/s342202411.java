import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X,A;
        X = scan.nextInt();
        A = scan.nextInt();
        if(X<A){
            System.out.println("0");
        }else{
            System.out.println("10");
        }
    }
}