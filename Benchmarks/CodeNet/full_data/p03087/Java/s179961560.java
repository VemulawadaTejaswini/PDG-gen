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
        for (int i = 0; i < r.length; i++) {
            int counter = 0;
            String t = s.substring(l[i] - 1, r[i]);
            int index_t = t.indexOf("AC"); 
            while (index_t != -1) {
                counter++;
                index_t = t.indexOf("AC", index_t + 2);
            }
            System.out.println(counter);
        }
        sc.close();
    }
}