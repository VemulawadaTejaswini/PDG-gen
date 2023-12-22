import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] xyz = sc.nextLine().split(" ");
        int x = Integer.parseInt(xyz[0]);
        int y = Integer.parseInt(xyz[1]);
        int z = Integer.parseInt(xyz[2]);
        System.out.println(problem161a(x, y, z));
    }

    private static String problem161a(int x, int y, int z) {
        int[] array = {x, y, z};
        swap(array, 0, 1);
        swap(array, 0, 2);
        return array[0] + " " + array[1] + " " + array[2];
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }
}