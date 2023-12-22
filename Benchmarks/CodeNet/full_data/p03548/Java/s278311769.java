import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();// 椅子の幅
        int y = sc.nextInt();// 人が座る幅
        int z = sc.nextInt();// 間の幅

        x -= z;// はじめの間をあける
        int count = 0;
        while (x > 0 && x - (y+z) >= 0) {
            x -= y;
            x -= z;
            count++;
        }

        System.out.println(count);
    }
}
