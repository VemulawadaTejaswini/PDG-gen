import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int windowSize = sc.nextInt();
        int curtainSize = sc.nextInt();
        int result = (windowSize - curtainSize * 2) <= 0 ? 0 :  (windowSize - curtainSize * 2);
        System.out.println(result);
    }
}