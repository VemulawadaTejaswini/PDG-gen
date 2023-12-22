import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = (1<<n);

        int diff = 0;
        int pos = 0;
        for(int i=0; i<n; i++) {
            if((a>>i)%2 != (b>>i)%2) {
                diff++;
                pos = i;
            }
        }
        int maxbit = 1<<(n-1);
        int posbit = 1<<pos;

        if(diff == 1) {
            System.out.println("YES");
            for(int i=0; i<m; i++) {
                if(i>0)System.out.print(" ");
                int base = i ^ (i>>1);
                int max = (base & maxbit) > 0 ? 1 : 0;
                int p = (base & posbit) > 0 ? 1 : 0;
                if(max == 1) {
                    base -= maxbit;
                    base += posbit;
                }
                if(p == 1) {
                    base -= posbit;
                    base += maxbit;
                }
                System.out.print(base ^ a);
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }

    }


}
