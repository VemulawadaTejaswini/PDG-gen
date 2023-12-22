import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int k=s.nextInt();
        
        for (int i = 0; i < k; i++) {
            System.out.println(a+i);
            
        }
        for (int i = k; i > 0; i++) {
            System.out.println(b-i);
        }
    }
}