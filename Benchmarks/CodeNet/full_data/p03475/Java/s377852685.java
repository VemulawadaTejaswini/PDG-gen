import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] C = new int[N];
        int [] S = new int[N];
        int [] F = new int [N];
        int [] time = new int[N];
        for(int a=0;a<N-1;a++){
            C[a]=sc.nextInt();
            S[a] = sc.nextInt();
            F[a] = sc.nextInt();
        }
        for(int a=0;a<N-1;a++){
            int each_time = 0;
            each_time = S[a]+C[a];
            for(int b=a+1;b<N;b++){
                if(each_time >= S[b]){
                each_time += C[b];
            }
            else {
                    each_time=0;
                    break;
                }
            }
            time[a]=each_time;
        }
        for(int a=0;a<N-1;a++){
            if(time[a]==0) {
                for (int b = a + 1;b<N-1;b++){
                    if(time[b]!=0)time[a]=time[b];
                }
            }
        }
        time[N-1]=0;
        for(int a=0;a<N;a++){
            System.out.println(time[a]);
        }

    }
}