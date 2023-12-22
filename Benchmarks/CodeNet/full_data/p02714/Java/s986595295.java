import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        char[] chars = s.toCharArray();

        List<Integer> listA = Stream.iterate(1, i -> i + 1)
                .limit(k)
                .collect(Collectors.toList());
        int[] ar1 = new int[listA.size()];
        ar1 = toArray(listA);
        int[] ar2 = ar1.clone();
        int[] ar3 = ar1.clone();
        int sum = 0;
        for (int n1 : ar1) {
            char s1 = chars[n1 - 1];
            for (int n2 : ar2) {
                char s2 = chars[n2 - 1];
                if (!(n1 < n2)) {
                    continue;
                }
                if(s1 == s2){
                    continue;
                }
                for (int n3 : ar3) {
                    if (!(n2 < n3)) {
                        continue;
                    }
                    char s3 = chars[n3 - 1];
                    if (s1 != s3 && s2 != s3) {
                        if (n2 - n1 != n3 - n2) {
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
    public static int[] toArray(List<Integer> target) {

        final int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }
}
