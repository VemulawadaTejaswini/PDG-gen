import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);
        int min = Math.max(aArr[0], 0);
        int max = aArr[aArr.length-1];

        int count = 0;
        for (int x = min; x <= max; x++) {
            int tmpCount = 0;
            for (int i = 0; i < aArr.length; i++) {
                if (aArr[i] == x || aArr[i] == x+1 || aArr[i] == x-1 ) tmpCount++;
            }

            if (count < tmpCount) count = tmpCount;
        }

        System.out.println(count);
    }
}
