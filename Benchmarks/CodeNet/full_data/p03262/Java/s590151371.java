import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] l = new int[N+1];
        int[] l2 = new int[N];
        for(int i = 0;i < N+1;i++)  l[i] = sc.nextInt();
        if(N == 1){
            System.out.println(Math.abs(l[0]-l[1]));
            return;
        }
        Arrays.sort(l);
        for(int i = 0;i < N;i++){
            l[i] = l[i+1]-l[i];
        }
        int d = 0;
        for(int i = 0;i < N-1;i++){
            if(i == 0)  d = l[0];
            int b = l[i+1];
            while(true){
                if(d%b == 0){
                    d = b;
                    break;
                }else{
                    int tmp = d;
                    d = b;
                    b = tmp%b;
                }
            }
            if(d == 1)  break;
        }
        System.out.println(d);
    }
}