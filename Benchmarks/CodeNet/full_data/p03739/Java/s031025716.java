import java.util.*;

public class Main{
    static int N;
    static int[] a;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        a = new int[N];
        int[] s1 = new int[N];
        int[] s2 = new int[N];
        
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(i == 0){
                s1[i] = a[i];
                s2[i] = a[i];
            }
            else {
                s1[i] = a[i] + s1[i-1];
                s2[i] = a[i] + s2[i-1];
            }
        }
        sc.close();
        
        System.out.println(Math.min(plus(s1), minus(s2)));
    }
    static int plus(int[] s){
        int count = 0;
        for(int i = 0; i < N; i++){
            if(i%2==0){
                if(s[i] > 0)
                    continue;
                else{
                    count+= 1-s[i];
                    for(int j = i+1; j < N; j++){
                        s[j] += 1-s[i];
                    }
                }
            }
            if(i%2!=0){
                if(s[i] < 0)
                    continue;
                else{
                    count+= s[i] + 1;
                    for(int j = i+1; j < N; j++){
                        s[j] -= s[i] + 1;
                    }
                }
            }
        }
        return count;
    }

    static int minus(int[] s){
        int count = 0;
        for(int i = 0; i < N; i++){
            if(i%2!=0){
                if(s[i] > 0)
                    continue;
                else{
                    count+= 1-s[i];
                    for(int j = i+1; j < N; j++){
                        s[j] += 1-s[i];
                    }
                }
            }
            if(i%2==0){
                if(s[i] < 0)
                    continue;
                else{
                    count+= s[i] + 1;
                    for(int j = i+1; j < N; j++){
                        s[j] -= s[i] + 1;
                    }
                }
            }
        }
        return count;

    }
}