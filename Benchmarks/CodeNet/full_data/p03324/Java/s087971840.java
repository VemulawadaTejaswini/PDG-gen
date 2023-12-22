import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("[\\s]+");
        int D = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int num = 1;
        for(int i = 0; i < D; i++) {
          num = num * 100;
        }
        if(N == 100) {
            N += 1;
        }
        System.out.println(num * N);
    }
}
