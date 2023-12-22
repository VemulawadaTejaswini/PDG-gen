import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for(int i = 0; i < n - 1; i++) {
        	b[i] = sc.nextInt();
        }
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
        	if(i == 0) {
        		a[i] = b[i];
        	}else if(i == n - 1) {
        		a[i] = b[i - 1];
        	}else {
        		a[i] = Math.min(b[i], b[i - 1]);
        	}
        }
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
	}

}
