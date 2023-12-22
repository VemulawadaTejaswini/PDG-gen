import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Map<String,Integer> minMap = new HashMap<>();
        final String MIN = "min";
        int[] numList = new int[220000];
        for(int i=0;i<N;i++){
            numList[i] = Integer.parseInt(sc.next());
        }
        minMap.put(MIN,numList[0]);
        int count = 0;
        for(int i=0;i<N;i++){
            if(numList[i] <= minMap.get(MIN)){
                minMap.put(MIN,numList[i]);
                count++;
            } 
        }
        System.out.println(count);
    }
}
