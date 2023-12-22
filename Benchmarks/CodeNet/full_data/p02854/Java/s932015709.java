import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)a[i] = sc.nextInt();
        int ans = 1001001001;
        for(int i = 0;i<n;i++){
            int tmpA = 0,tmpB =0;
            for(int j = 0;j<i;j++)tmpA+=a[j];
            for(int j = i;j<n;j++)tmpB+=a[j];
            ans = Math.min(Math.abs(tmpA-tmpB),ans);
        }
        System.out.println(ans);
    }
}
