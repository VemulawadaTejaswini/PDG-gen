import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            if(c.contains(a[i])) {
                System.out.println("NO");
                System.exit(0);
            }else{
                c.add(a[i]);
            }
        }
        System.out.println("YES");
    }
}