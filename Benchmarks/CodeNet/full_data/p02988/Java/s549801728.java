package Calentamiento;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] numbers = new int [n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            
        }
        for (int i = 1; i < (n-1); i++) {
            int a = numbers[i-1];
            int b = numbers[i];
            int c = numbers[i+1];
            if((a>=b && a<=c) || (a<=b && a>=c)){
                System.out.println(a);
            }else if ((b>=a && b<=c) || (b<=a && b>=c)){
                System.out.println(b);
            }else if ((c>=a && c<=b) || (c<=a && c>=b)){
                System.out.println(c);
            }
        }
    }
    
    
}