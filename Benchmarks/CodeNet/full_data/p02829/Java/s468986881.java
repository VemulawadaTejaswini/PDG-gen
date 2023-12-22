import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a + b == 3) {
            System.out.println(3);
        }
        else if(a + b == 4) {
            System.out.println(2);
        }
        else {
            System.out.println(1);
        }
        sc.close();

    }

}
