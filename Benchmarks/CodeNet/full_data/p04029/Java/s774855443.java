
package javaapplication128;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for(int i = n ; i>0;i-- ){
        res+=i;
        }
        System.out.println(res);
    }
    
}
