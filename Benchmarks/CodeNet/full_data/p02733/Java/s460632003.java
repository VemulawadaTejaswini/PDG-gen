import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        int[][] S = new int[H][W];
        for (int i=0;i<H;i++) {
            String tmp = sc.next();
            for (int j=0;j<W;j++) {
                S[i][j] = (int)(tmp.charAt(j)-48);
            }
        }

        int max = 1_000_000_000;

        for (int i=0;i<(1<<(H-1));i++) {
            int[] arr = new int[H-1];
            int tmp = i;
            int h_cut = 0;
            for (int j=0;j<H-1;j++) {
                arr[j] = tmp%2;
                h_cut+=arr[j];
                tmp/=2;
            }
            ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(0);
            for (int j=0;j<H-1;j++) {
                if (arr[j]==0) set.add(j+1);
                else {
                    list.add(set);
                    set = new HashSet<Integer>();
                    set.add(j+1);
                }
            }
            list.add(set);
            // System.out.println(Arrays.toString(arr));
            // System.out.println(list);

            int n = list.size();
            int[] white_tmp = new int[n];
            boolean[] cut_flag = new boolean[W];
            int cut_cnt = 0;
            boolean flgg = false;
            for (int j=0;j<W;j++) {
                boolean exit = false;
                loop:for (int k=0;k<n;k++) {
                    for (Integer h : list.get(k)) {
                        if (S[h][j]==1) {
                            white_tmp[k]++;
                            if (white_tmp[k]>K) {
                                cut_cnt++;
                                Arrays.fill(white_tmp, 0);
                                exit = true;
                                if (cut_flag[j]) {
                                    flgg = true;
                                    cut_cnt = 1_000_000_000;
                                    break loop;
                                }
                                cut_flag[j] = true;
                                break loop;
                            }
                        }
                    }
                }
                if (flgg) {
                    break;
                }
                if (exit) j--;
            }
            max = Math.min(max, h_cut+cut_cnt);
        }
        System.out.println(max);
    }
}