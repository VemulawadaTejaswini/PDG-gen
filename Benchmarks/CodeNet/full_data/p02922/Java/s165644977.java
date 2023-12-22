import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count=0;
        int nowkuchi=1;
        int wantkuchi=B;
        while(nowkuchi < wantkuchi){
            nowkuchi += A-1;
            count += 1;
        }
        System.out.println(count);
    }
}