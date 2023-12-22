import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long x = sc.nextLong();
        
        if(500*k<x){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
    }
}