import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, n = num;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        if(num % sum == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
