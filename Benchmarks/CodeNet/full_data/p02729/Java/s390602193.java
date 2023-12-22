import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int n = (num1*(num1-1))/2;
        int m = (num2*(num2-1))/2;
      
        int sum = n + m;
 
        System.out.println(sum);
        scan.close();
    }
}