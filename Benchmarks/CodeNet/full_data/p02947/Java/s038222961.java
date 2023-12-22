import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> wordFreq = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	String word = sc.next();
        	char[] arr = word.toCharArray();
        	Arrays.sort(arr);
        	String newWord = new String(arr);
        	wordFreq.put(newWord, wordFreq.getOrDefault(newWord, 0) + 1);
        }
        long res = 0;
        for(Integer freq : wordFreq.values()) {
        	if(freq < 2) continue;
        	res += comb(freq);
        }
        System.out.println(res);
    }

    private static long comb(long a) {
    	return a * (a - 1) / 2;
    }
}
