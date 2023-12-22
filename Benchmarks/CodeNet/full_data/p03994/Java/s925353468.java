import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int k = sc.nextInt();

        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 'a') continue;
        	int diff = 26 - (arr[i] - 'a');
        	if(diff <= k) {
        		k -= diff;
        		arr[i] = 'a';
        	}
        	if(k == 0) break;
        }
        if(k > 0) {
        	k = k % 26;
        	k = (k + (arr[arr.length-1] - 'a')) % 26;
        	arr[arr.length - 1] = (char)(k + 'a');
        }
        System.out.println(new String(arr));
    }
}
