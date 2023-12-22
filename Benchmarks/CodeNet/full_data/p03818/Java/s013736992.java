import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        if(freqMap.size() % 2 == 1)
        	System.out.println(freqMap.size());
        else
        	System.out.println(freqMap.size() - 1);
    }
}
