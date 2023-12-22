import java.util.*;


public class Main {

    static List<String> z;

    public static void permutation(String q, String ans) {
        if (q.length() <= 1) {
            z.add(ans + q);
        } else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        z = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Xz = new int[N];
        int[] Yz = new int[N];

        for (int i = 0; i < N; i++){
            Xz[i] = sc.nextInt();
            Yz[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        for (int n = 0; n < N; n++) {
            sb.append(Integer.toString(n));
        }

        permutation(sb.toString(), "");

        int cnt = 0; double sum = 0; double diff = 0;
        String text = "";
        for (int i = 0; i < z.size(); i++) {
//            System.out.println(z.get(i));
            text = z.get(i).toString();
            cnt++;
            diff = 0;
            double left = 0; double right = 0;
            for (int j = 1; j < N; j++){
//                System.out.println("aaaa");
//                System.out.println(text.charAt(j - 1));
//                System.out.println(text.charAt(j));
//                System.out.println(Xz[text.charAt(j - 1) - 48]);
//                System.out.println(Xz[text.charAt(j) - 48]);
//                System.out.println(Yz[text.charAt(j - 1) - 48]);
//                System.out.println(Yz[text.charAt(j) - 48]);
//                System.out.println((Xz[text.charAt(j - 1) - 48]));// - Xz[text.charAt(j)]));
                left = Math.pow((Xz[text.charAt(j - 1) - 48] - Xz[text.charAt(j) - 48]), 2);
//                System.out.println(left);
                right = Math.pow((Yz[text.charAt(j - 1) - 48] - Yz[text.charAt(j) - 48]), 2);
//                System.out.println(right);
                diff += Math.sqrt(Math.pow((Xz[text.charAt(j - 1) - 48] - Xz[text.charAt(j) - 48]), 2) + Math.pow((Yz[text.charAt(j - 1) - 48] - Yz[text.charAt(j) - 48]), 2));
            }
//            double mean = (double) diff / (N-1);
            double mean = diff;
//            System.out.println("mean: "+mean);
//            sum += diff / (N-1);
            sum += mean;
//            System.out.println("sumaa: "+sum);
        }

//        System.out.println("sum: "+sum);
//        System.out.println("cnt: "+cnt);
        System.out.println((double) (sum / cnt));




    }
}