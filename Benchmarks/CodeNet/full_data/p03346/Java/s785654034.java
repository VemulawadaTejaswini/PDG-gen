import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int ans[] = new int[n+1];
        ans[a[0]]=1;
        for(int i=0;i<n;i++){
            ans[a[i]]=ans[a[i]-1]+1;
        }
        int max = 0;
        for(int i=1;i<=n;i++){
            if (ans[i]>max){
                max = ans[i];
            }
        }
        System.out.println(n-max);
    }
}
