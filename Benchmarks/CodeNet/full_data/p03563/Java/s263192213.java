import java.util.Scanner;

class c076_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        int target = sc.nextInt();

        System.out.println(current + (target - current) * 2);
    }
}
