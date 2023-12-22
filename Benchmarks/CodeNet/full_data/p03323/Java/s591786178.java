import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("[\\s]+");
        int D = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int num = (1 * 100) * D;
        if(num == 0) {
          System.out.println(N);
        } else {
          System.out.println(num * N);
        }
    }
}
