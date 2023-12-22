import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v1 = new int[10001];
        int[] v2 = new int[10001];
        int max1 = 0;
        int m1=0;
        int max2 = 0;
        for (int i=0;i<n/2;i++){
            v1[scanner.nextInt()]++;
            v2[scanner.nextInt()]++;
        }
        for (int i=0;i<10001;i++){
            max1 = Math.max(max1,v1[i]);
            if (v1[i]==max1)m1=i;
        }
        for (int i=0;i<10001;i++){
            if (i!=m1)max2 = Math.max(max2,v2[i]);
        }

        System.out.println(n-max1-max2);


    }
}