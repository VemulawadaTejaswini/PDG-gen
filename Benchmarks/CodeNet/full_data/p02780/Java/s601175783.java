import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Integer> numList = new ArrayList<>();
        List<Integer> queryList = new ArrayList<>();
        for(int i=0;i<N;i++){
            numList.add(Integer.parseInt(sc.next()));
        }
        int volume = 0;
        for(int i=0;i<N;i++){
            volume += numList.get(i);
            queryList.add(volume);
        }
        int max = 0;
        for(int i=0;i<N-K;i++){
            int sectionMax = queryList.get(i+K) - queryList.get(i);
            max = Math.max(sectionMax,max);
        }
        double result = (max + K)/2.0;
        System.out.println(String.format("%.12f",result));
}
}