import java.util.*;
public class Main {
    static boolean[] f  = new boolean[100001];
    //素数判定


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for(int i=0;i<Q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        int[] answer = new int[Q];
        f[0] = f[1]=true;
        for(int i=2;i<=100000;i++){
            if(!f[i]){
                for(int j=i*2;j<=100000;j=j+i){
                    f[j] = true;
                }
            }
        }

        for(int i=0;i<Q;i++){
            int p = l[i] + 1;
            int q = r[i] + 1;
            p = p/2;
            q = q/2;
            for(int j=p;j<=q;j++){
                if(f[j]==false && f[2*j-1]==false) {
                    answer[i]++;
                }
            }
            System.out.println(answer[i]);
        }



    }

}
