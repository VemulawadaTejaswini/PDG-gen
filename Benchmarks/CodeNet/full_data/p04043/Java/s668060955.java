import java.util.Arrays;
import java.util.Scanner;

class main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempList[] = new int[3];
        for (int i = 0; i < 3; i++) {
            tempList[i] = sc.nextInt();
        }
        Arrays.sort(tempList);

        int[] anserList = {5, 5, 7};

        if (Arrays.equals(tempList, anserList)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
