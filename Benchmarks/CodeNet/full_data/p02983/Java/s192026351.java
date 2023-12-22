import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt() % 2019;
        int j = sc.nextInt() % 2019;
        int ret = i < j ? i : j;

        System.out.println(ret * (ret + 1));

        sc.close();
    }
}