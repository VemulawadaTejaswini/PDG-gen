import java.util.*;

public class Main {
    static int pow4(int n) {
        int ans = 1;
        for (int i=0;i<n;i++) {
            ans *= 4;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.next());
        L--;
        String S = Integer.toString(L, 4);
        int sum = 0;
        int N = S.length();
        for (int i=0;i<N;i++) {
            sum += (int)S.charAt(i)-48;
        }
        if (N==1) {
            L++;
            System.out.println(2+" "+L);
            for (int i=0;i<L;i++) {
                System.out.println(1+" "+2+" "+i);
            }
            return;
        }

        System.out.println((2*N) + " " + (4*(N-1)+sum+N));
        for (int i=0;i<N;i++) {
            int a = (int)S.charAt(N-1-i)-48;
            int first = 2*i;
            if (i==0) {
                first=1;
                for (int j=0;j<4;j++) {
                    System.out.println(first+" "+(2*i+2)+" "+j);
                }
                for (int j=0;j<a;j++) {
                    System.out.println(first+" "+(2*i+3)+" "+j);
                }
                System.out.println(first+" "+(2*i+3)+" "+a);
            } else if (i>0 && i<N-1) {
                for (int j=0;j<4;j++) {
                    System.out.println(first+" "+(2*i+2)+" "+(pow4(i)*j));
                }
                for (int j=0;j<a;j++) {
                    System.out.println(first+" "+(2*i+3)+" "+(pow4(i)*j));
                }
                System.out.println((first+1)+" "+(2*i+3)+" "+(pow4(i)*a));
            } else { // i==N-1
                for (int j=0;j<a;j++) {
                    System.out.println(first+" "+(2*i+2)+" "+(pow4(i)*j));
                }
                System.out.println((first+1)+" "+(2*i+2)+" "+(pow4(i)*a));
            }
        }
    }
}