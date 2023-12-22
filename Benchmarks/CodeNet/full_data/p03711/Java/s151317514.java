import java.util.Scanner;

public class Main {

    private static final boolean matched(int a, int b, int arr[]) {
        boolean hasA = false;
        boolean hasB = false;
        for (int i : arr) {
            if (a != i) {
                continue;
            }
            hasA = true;
            break;
        }
        for (int i : arr) {
            if (b != i) {
                continue;
            }
            hasB = true;
            break;
        }
        return hasA && hasB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] groupsA = {1, 3, 5, 7, 8, 10, 12};
        int[] groupsB = {4, 6, 9, 11};
        int[] groupsC = {2};

        if (matched(x, y, groupsA) || matched(x, y, groupsB) || matched(x, y, groupsC)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
