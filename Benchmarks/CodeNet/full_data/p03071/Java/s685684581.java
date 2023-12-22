import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A - 1 > B) {
            
            System.out.println(A + A - 1);
        } else if (B - 1 > A) {
            
            System.out.println(B + B - 1);
        } else {
            
            System.out.println(A + B);
        }
        
        sc.close();
    }
    
}