import java.util.*;

public class Main {

    static List<String> z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        Arrays.setAll(p, i -> sc.nextInt());
        Arrays.setAll(q, i -> sc.nextInt());

        z = new ArrayList<>();
        String s = "";
        String pa = "";
        String qb = "";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        for (int i = 0; i < n; i++) {
            pa += p[i];
            qb += q[i];
        }
        permutation(s,"");
        int a = 0;
        int b = 0;
        for(int i = 0; i < z.size(); i++) {
            if (z.get(i).equals(pa)) a = i;
            if (z.get(i).equals(qb)) b = i;
        }
        System.out.println(Math.abs(a-b));
    }

    public static void permutation(String q, String ans){
        if(q.length() <= 1) {
            z.add(ans + q);
        }
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                ans + q.charAt(i));
            }
        }
    }

}