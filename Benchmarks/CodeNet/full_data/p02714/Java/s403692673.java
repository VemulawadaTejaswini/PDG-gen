import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        List<Integer> listR = new ArrayList<>();
        List<Integer> listG = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R') listR.add(i+1);
            if (c[i] == 'G') listG.add(i+1);
            if (c[i] == 'B') listB.add(i+1);
        }
        int ans = 0;
        int[] array = new int[3];
        for(Integer i : listR) {
            for(Integer i2 : listG) {
                for(Integer i3 : listB) {
                    array[0] = i;
                    array[1] = i2;
                    array[2] = i3;
                    Arrays.sort(array);
                    if (check(array[2],array[1],array[0])) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    private static boolean check(int max, int mid, int min) {
        return !(mid -min == max - mid);
    }
}

