import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a * (a+1) * b;
        if(ans > 0) {
            System.out.println("Positive");
        }else if(ans < 0) {
        	 System.out.println("Negative");
        }else {
        	System.out.println("Zero");
        }
    }
}