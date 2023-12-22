import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v1 = new int[100001];
        int[] v2 = new int[100001];
        int max1 = 0;
        int m1=0;
        int m2=0;
        int max2 = 0;
        for (int i=0;i<n/2;i++){
            v1[scanner.nextInt()]++;
            v2[scanner.nextInt()]++;
        }
        for (int i=1;i<100001;i++){
            max1 = Math.max(max1,v1[i]);
            if (v1[i]==max1)m1=i;
            max2 = Math.max(max2,v2[i]);
            if (v2[i]==max2)m2=i;
        }
        if (max1>=max2){
            for (int i=1;i<100001;i++){
                if (i!=m1)max2 = Math.max(max2,v2[i]);
            }
        }else {
            for (int i=1;i<100001;i++){
                if (i!=m2)max1 = Math.max(max1,v1[i]);
            }
        }
        if (max1==max2&&m1==m2&&max1+max2==n){
            System.out.println(n/2);
        }else {
            System.out.println(n-max1-max2);
        }
    }
}