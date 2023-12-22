import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
       	Arrays.fill(arr, -1);
        while(m-- > 0) {
        	int idx = sc.nextInt() - 1;
        	int num = sc.nextInt();
        	if(idx == 0 && num == 0 || arr[idx] > -1 && arr[idx] != num) {
        		System.out.println(-1);
        		return;
        	}
        	arr[idx] = num;
        }
        for(int i = 0; i < n; i++) {
        	if(i == 0 && arr[i] == -1) {
        		System.out.print(1);
        		continue;
        	} 
        	if(arr[i] == -1)
        		System.out.print(0);
        	else
        		System.out.print(arr[i]);
        }
        System.out.println();
    }
}
