import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count=1;
        int nowkuchi=A;
        int wantkuchi=B;
        while(nowkuchi < wantkuchi){
            nowkuchi = count*A-1;
            count += 1;
        }
        System.out.println(count);
    }
}