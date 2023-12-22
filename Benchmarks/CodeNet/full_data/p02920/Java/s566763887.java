import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] s = new int[(1<<N)];
        for (int i=0;i<(1<<N);i++) {
            s[i] = sc.nextInt();
        }

        int[] nums = new int[N];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<N;i++) list.add(1);
        nums[0] = N;
        for (int i=0;i<N-1;i++) {
            int num_tmp = 0;
            ArrayList<Integer> ruiseki = new ArrayList<Integer>();
            num_tmp += 1;
            ruiseki.add(1);
            for (int j=1;j<list.size()-1;j++) {
                num_tmp += list.get(j)+ruiseki.get(ruiseki.size()-1);
                ruiseki.add(list.get(j)+ruiseki.get(ruiseki.size()-1));
            }
            nums[i+1] = num_tmp;
            list = ruiseki;
        }

        int[] nums_new = new int[N+1];
        nums_new[0] = 1;
        for (int i=0;i<N;i++) {
            nums_new[i+1] = nums[i];
        }

        Arrays.sort(s);
        int[] S = new int[(1<<N)];
        for (int i=0;i<(1<<N);i++) {
            S[i] = s[(1<<N)-1-i];
        }

        boolean flag = true;
        int index = 0;

        TreeMap<Integer, Integer> before = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> now = new TreeMap<Integer, Integer>();
        for (int i=0;i<N+1;i++) {

            for (int j=0;j<nums_new[i];j++) {
                if (now.containsKey(S[index])) {
                    now.put(S[index], now.get(S[index])+1);
                } else {
                    now.put(S[index], 1);
                }
                index++;
            }

            for (Map.Entry<Integer, Integer> entry : now.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                if (before.containsKey(key)) {
                    if (before.get(key) + now.get(key) > nums_new[i-1]) flag = false;
                }
            }

            // System.out.println("#####");
            // System.out.println(now);
            // System.out.println(before);
            // System.out.println("#####");
            // before = new TreeMap<Integer, Integer>(now);
            before = now;
            now = new TreeMap<Integer, Integer>();
        }
        // System.out.println(Arrays.toString(nums_new));
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}