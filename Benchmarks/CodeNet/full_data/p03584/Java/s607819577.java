import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> K_list = new ArrayList<Long>();
        long K = sc.nextLong();
        String str = Long.toBinaryString(K);
        int len = str.length();
        long K_2 = (1L<<(len-1))-1;
        long K_3 = (1L<<(len-1));

        K_list.add(K);
        long tmp = (1L<<(len-1));
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i=len-2;i>=1;i--) {
            if (str.charAt(len-1-i)=='1') {
                StringBuilder sb_tmp = new StringBuilder(sb);
                sb_tmp.append('0');
                long K_tmp = (1L<<i)-1;
                sb_tmp.append(Long.toBinaryString(K_tmp));
                K_list.add(Long.parseLong(sb_tmp.toString(), 2));
            }
            sb.append(str.charAt(len-1-i));
        }
        K_list.add((1L<<(len-1))-1);
        // System.out.println(K_list);

        long ans_1 = 0L;
        long ans_2 = 0L;
        long ans_3 = 0L;
        long[] ans = new long[K_list.size()];
        for (int i=0;i<N;i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            for (int j=0;j<K_list.size();j++) {
                if ((A|K_list.get(j))==K_list.get(j)) ans[j]+=B;
            }
        }
        long max = 0L;
        for (int i=0;i<K_list.size();i++) {
            max = Math.max(max, ans[i]);
        }
        System.out.println(max);
    }
}