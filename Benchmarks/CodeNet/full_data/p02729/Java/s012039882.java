import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = sc.nextInt();
        int odd = sc.nextInt();
        int result = 0;
        for (int i = even - 1; i > 0; i--){
            result = result + i;
        }
        for (int i = odd - 1; i > 0; i--){
            result = result + i;
        }
        System.out.println(result);

    }
}
