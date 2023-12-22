import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input = new String[N];
        int k = 0;
        for(String s: sc.next().split("")){
            input[k] = s;
            k++;
        }
        int max_count = -1;
        for (int i = 1; i < N; i++){
            String[] tmpA = Arrays.copyOfRange(input, 0, i);
            String[] tmpB = Arrays.copyOfRange(input, i, N);
            List<String> listA = Arrays.asList(tmpA);
            List<String> listB = Arrays.asList(tmpB);
            List<String> dist_listA = new ArrayList<>(new HashSet<>(listA));
            List<String> dist_listB = new ArrayList<>(new HashSet<>(listB));
            int count = 0;
            for(int j = 0; j < dist_listA.size(); j++){
                if(dist_listB.indexOf(dist_listA.get(j)) != -1){
                    count++;
                }
            }
            if(max_count < count){
                max_count = count;
            }
        }
        System.out.println(max_count);
    }
}
