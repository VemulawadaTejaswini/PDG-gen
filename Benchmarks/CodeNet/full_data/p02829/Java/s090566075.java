import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + sc.nextInt();
        int[] nums = {1, 2, 3};

        switch (a) {
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(2);
                break;
            case 5:
                System.out.println(1);
                break;
            default:
                return;
        }
    }
}

