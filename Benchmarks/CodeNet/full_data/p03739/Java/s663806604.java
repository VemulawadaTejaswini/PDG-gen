import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] s = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(i == 0){
                s[0] = a[0];
            } else {
                s[i] = s[i-1]+a[i];
            }
        }
        sc.close();

        long cnt1 = 0;
        long cnt2 = 0;
        long diff1 = 0;
        long diff2 = 0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                if(s[i]+diff1 <= 0){
                    cnt1 += 1-s[i]-diff1;
                    diff1 += 1-s[i];
                }
            } else {
                if(s[i]+diff1 >= 0){
                    cnt1 += s[i] + diff1 + 1;
                    diff1 += -1-s[i];
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(i%2 == 0){
                if(s[i]+diff2 >= 0){
                    cnt2 += s[i] + diff2 + 1;
                    diff2 += -1-s[i];
                }  
            } else {
                if(s[i]+diff2 <= 0){
                    cnt2 += 1-s[i]-diff2;
                    diff2 += 1-s[i];
                }
            }
        }

        System.out.println(Math.min(cnt1, cnt2));
    }
}