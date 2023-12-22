import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < r.length; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        Set<Integer> a = new HashSet<>();
        int index = s.indexOf("AC");
        while (index != -1) {
            a.add(index);
            index = s.indexOf("AC", index + 2);
        }
        for (int i = 0; i < r.length; i++) {
            int counter = 0;
            for (int j : a) {
                if (l[i] - 1 <= j && j < r[i] - 1) {
                    counter++;       
                }
            }
            System.out.println(counter);
        }
        sc.close();
    }
}