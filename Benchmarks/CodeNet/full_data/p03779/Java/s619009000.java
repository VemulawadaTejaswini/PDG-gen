import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;

        while (0 < x){
            x -= ++i;

        }
        System.out.println(i);
    }
}