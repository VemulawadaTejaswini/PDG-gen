import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        boolean flag = false;
        if(a < b) {
            for(int i = a; i <= b; i ++) {
                if(i == c) {
                    flag = true;
                    break;
                }
            }
        } else {
            for(int i = b; i <= a; i ++) {
                if(i == c) {
                    flag = true;
                    break;
                }
            }
        }
        String str = flag ? "Yes" : "No";
        System.out.println(str);
    }
}