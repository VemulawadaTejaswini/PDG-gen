import java.util.Scanner;

public class ACORWA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if(n == m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}