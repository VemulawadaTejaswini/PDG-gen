import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("[\\s]+");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        if(N % K == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}