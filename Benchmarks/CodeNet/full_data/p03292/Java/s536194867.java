import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] val = new int[3];
        for (int x = 0; x < 3; x++) val[x] = scanner.nextInt();
        int sum = 0;
        Arrays.sort(val);
        for(int y = 1; y<3; y++){
            sum = sum+ Math.abs(val[y]-val[y-1]);
        }
        System.out.println(sum);

    }

}
