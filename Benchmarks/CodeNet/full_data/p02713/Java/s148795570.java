import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                for (int k=1;k<=n;k++) {
                    int a=i;
                    int b=j;
                    int c=k;
                    int d=0;
                    while (a%b>0) {
                        if (a<b) {
                          d=b;
                          b=a;
                          a=d;
                        } else {
                            a=a%b;
                        }
                    }
                    while (b%c>0) {
                        if (b<c) {
                            d=c;
                            c=b;
                            b=d;
                        } else {
                            b=b%c;
                        }
                    }
                    ans+=c;
                }
            }
        }
        System.out.println(ans);
    }
}
