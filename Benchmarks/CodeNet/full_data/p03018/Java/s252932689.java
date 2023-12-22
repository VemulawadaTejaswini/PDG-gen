import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int length = arr.length;
        ArrayList<ArrayList<Boolean>> list = new ArrayList<>();
        int idx = 0;
        while (idx < length) {
            ArrayList<Boolean> each = new ArrayList<>();
            while (idx < length) {
                if (arr[idx] == 'A') {
                    each.add(true);
                    idx++;
                } else if (arr[idx] == 'B' && idx < length - 1 && arr[idx + 1] == 'C') {
                    each.add(false);
                    idx += 2;
                } else {
                    idx++;
                    break;
                }
            }
            if (each.size() > 0) {
                list.add(each);
            }
        }
        int total = 0;
        for (ArrayList<Boolean> each : list) {
            int aSum = 0;
            int count = 0;
            for (boolean b : each) {
                if (b) {
                    aSum++;
                } else {
                    count += aSum;
                }
            }
            total += count;
        }
        System.out.println(total);
    }
}