import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int k = n;
        int cnt = 0;
        int temp = n;
        while(true) {
            if(n%k==0) {
                n = n/k;
            } else if(n-k==1) {
                n = n-k;
            }
            if(n==1) {
               cnt++;
            }
            k=k-1;
            if(k<=0) {
               break;
            }
        }
        System.out.println(String.valueOf(cnt));
    }
}