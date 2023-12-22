import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenBalls = sc.nextInt();
        int oddBalls = sc.nextInt();
	    int result = execute(evenBalls,oddBalls);
        System.out.println(result);
    }

    public static int execute(int evenBalls, int oddBalls){
        //偶数と偶数、奇数と奇数でのみ組み合わせ
        return evenBalls*(evenBalls - 1)/2
                +oddBalls*(oddBalls - 1)/2;
    }
}