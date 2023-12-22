import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        sc.nextLine();
        String[] array = sc.nextLine().split(" ");
        int length = array.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < length; j++) {
                sb.append(array[j]);
            }
        }
        int size = sb.length();
        int cnt = 0;
        for (int i = 0; i < size; i++) {
            int tmp = Character.getNumericValue(sb.charAt(i));
            for (int j = 0; j < size; j ++) {
                if (i == j || i > j) continue;
                if (tmp > Character.getNumericValue(sb.charAt(j))) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt % 1000000007);
    }
}