import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] s = new String[N];
        int[] ns = new int[N];

        for(int i=0; i<N; i++){
            s[i] = sc.next();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(s[i].equals(s[j])){
                    ns[i] += 1;
                }
            }
        }

        int M = sc.nextInt();
        String[] t = new String[M];
        int[] nt = new int[M];

        for(int i=0; i<M; i++){
            t[i] = sc.next();
        }
        for(int i=0; i<M; i++){    
            for(int j=0; j<M; j++){
                if(t[i].equals(t[j])){
                    nt[i] += 1;
                }
            }
        }

        int max = -100;
        int x = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(s[i].equals(t[j])){
                    max = Math.max(max, ns[i]-nt[j]);
                }
                else{
                    x += 1;                }
            }
            if(x==M){
                max = Math.max(max, ns[i]);
            }
            x = 0;
        }
        if(max>=0){
            System.out.println(max);
        }
        else{
            System.out.println(0);
        }
    } 
}