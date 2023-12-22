import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] a,b;
        n = Integer.parseInt(sc.next());
        a = new int[n];
        b = new int[n];

        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
        }

        int maxT = 0;
        int maxN = 0;
        int time = 0;


        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (maxT < b[j]) {
                    maxT = b[j];
                    maxN = i;
                    if(i==0){
                        time = maxT;
                    }
                }
            }
            time -= a[maxN];
            b[maxN] = 0;
            a[maxN] = 0;
            maxT = 0;
        }
        if(time <0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}