import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = n / 10 * 10;
        if(n-value == 7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}