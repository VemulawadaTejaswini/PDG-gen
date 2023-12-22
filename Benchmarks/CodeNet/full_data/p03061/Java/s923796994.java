import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[]table = new int[m];
        for (int i = 0; i < m; i++) {
            table[i]= sc.nextInt();
        }

        int sum;
        int ans=0;

        for (int i = 0; i <m; i++) {
        	boolean key=false;
        	if(i==0)
        		sum=table[1];
        	else
        		sum=table[0];
        	for(int j = 0;  j<m; j++) {
        		if(j==i) {
        		}
        		else {
        		sum=gcd(table[j],sum);
        		if(sum>ans&&key==true)
                 	ans=sum;
        		key=true;
        		}
        	}
        	if(ans==0)
        		ans=sum;
        }
        System.out.println(ans);
        sc.close();
    }


    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}