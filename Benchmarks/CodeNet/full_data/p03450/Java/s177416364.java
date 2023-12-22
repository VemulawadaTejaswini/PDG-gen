import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<int[]> Mdata = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int[] data = new int[3];
            data[0] = scanner.nextInt();
            data[1] = scanner.nextInt();
            data[2] = scanner.nextInt();
            Mdata.add(data);
        }
        scanner.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] data : Mdata) {
            int L = (map.containsKey(data[0])) ? map.get(data[0]) : 0;
            int R = (map.containsKey(data[1])) ? map.get(data[1]) : data[2] + L;
            int D = R - L;
            map.put(data[0], L);
            map.put(data[1], R);
            if (data[2] != Math.abs(D)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}