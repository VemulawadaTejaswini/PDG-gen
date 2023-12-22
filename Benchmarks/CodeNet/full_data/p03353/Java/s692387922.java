import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int K = sc.nextInt();
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int count = 0;
        String answer = new String();
//        double start = System.currentTimeMillis();
        for(int i = 0; i < alpha.length; i++){
            char c = alpha[i];
            int[] idx_tmp = new int[5000];
            int[] idx;
            int idxidx = 0;
            boolean nozero_flag = false;
            for (int j = 0; j < str.length(); j++) {
                if(c == str.charAt(j)){
                    idx_tmp[idxidx] = j;
                    idxidx++;
                    nozero_flag = true;
                }
            }
            idx = new int[idxidx];
            if(nozero_flag) {
                HashSet<String> substr = new HashSet<>();
                idx[0] = idx_tmp[0];
                for (int l = 1; l < idxidx; l++) {
                    if (idx_tmp[l] != 0) {
                        idx[l] = idx_tmp[l];
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < idx.length; j++) {
                    int index = idx[j];
                    for (int k = 0; k < K; k++) {
                        if (index + k < str.length()) {
                            substr.add(str.substring(index, index + k + 1));
                        }
                    }
                }
                int prev_count = count;
                count += substr.size();
                List<String> sorted_substr = substr.stream().sorted().collect(Collectors.toList());
                if (count >= K) {
                    answer = sorted_substr.get(K - prev_count - 1);
                    break;
                }
            }
        }
        System.out.println(answer);
//        double end = System.currentTimeMillis();
//        System.out.println("Time taken: "+ (end - start) + "ms");
    }
}
