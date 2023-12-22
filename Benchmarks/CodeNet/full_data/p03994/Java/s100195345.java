import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	int K = sc.nextInt();
    	char[] arr = s.toCharArray();
    	int i = 0;
    	while (i < arr.length && K > 0) {
    		if (arr[i] != 'a') {
    			int k = 26 - (arr[i] - 'a');
    			if (k <= K) {
    				arr[i] = getNextKLetters(arr[i], k);
    				K -= k;
    			}
    		}
    		i++;
    	}
    	if (K > 0) {
    		arr[arr.length - 1] = getNextKLetters(arr[arr.length - 1], K);
    	}
    	System.out.println(new String(arr));

    }
    public static char getNextKLetters(char ch, int k) {
    	int index = (ch - 'a' + k) % 26;
    	return (char)('a' + index);
    }

}