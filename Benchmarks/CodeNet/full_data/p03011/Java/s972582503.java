import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dis = new int[3];

        for(int i=0; i<3; i++) {
            dis[i] = scan.nextInt();
        }



        int[] sum = {0, 0, 0};


        sum[0] = dis[0] + dis[1];
        sum[1] = dis[0] + dis[2];
        sum[2] = dis[1] + dis[2];

        Arrays.sort(sum);

        System.out.println(sum[0]);
    }
}
