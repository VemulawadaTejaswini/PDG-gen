import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s1 = new long[n];
        long[] s2 = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(i == 0){
                s1[0] = a[0];
                s2[0] = a[0];
            } else {
                s1[i] = s1[i-1]+a[i];
                s2[i] = s2[i-1]+a[i];
            }
        }
        sc.close();

        long cnt1 = 0;
        long cnt2 = 0;

        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                if(s1[i] <= 0){
                    long diff = 1-s1[i];
                    cnt1 += diff;
                    for(int j = i; j < n; j++){
                        s1[j] += diff;
                    }
                }
            } else {
                if(s1[i] >= 0){
                    long diff = s1[i] + 1;
                    cnt1 += diff;
                    for(int j = i; j < n; j++){
                        s1[j] -= diff;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                if(s2[i] >= 0){
                    long diff = s2[i]+1;
                    cnt2 += diff;
                    for(int j = i; j < n; j++){
                        s2[j] -= diff;
                    }
                }
            } else {
                if(s2[i] <= 0){
                    long diff = 1-s2[i];
                    cnt2 += diff;
                    for(int j = i; j < n; j++){
                        s2[j] += diff;
                    }
                }
            }
        }

        System.out.println(Math.min(cnt1, cnt2));
    }
}