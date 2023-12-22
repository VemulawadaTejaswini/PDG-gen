import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        int ans = sum;
        int tmpA = 0,tmpB = sum;
        for(int i =0;i<n;i++){
            tmpA += a[i];
            tmpB -= a[i];
            ans = Math.min(Math.abs(tmpA-tmpB),ans);
        }
        System.out.println(ans);
    }
}
