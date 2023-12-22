import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        for(int i=0;i<n+1;i++)for(int j=0;j<n-i+1;j++){
            int k=n-i-j;
            if(y==i*10000+j*5000+1000*k){
                System.out.println(i+" "+ j+" "+k);
                return;
            }
        }

        System.out.println("-1 -1 -1");
    }

}
