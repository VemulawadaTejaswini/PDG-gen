import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String I = sc.next();
        long opt = 0;
        int [] list = new int [N];
        for(int i=0;i<N;i++){
            if(I.charAt(i)=='r') list[i]=P;
            else if(I.charAt(i)=='s') list[i]=R;
            else if(I.charAt(i)=='p') list[i]=S;
        }
        for(int i=0;i<K;i++)opt+=list[i];
        for(int i=K;i<N;i++){
            if(list[i]!=list[i-K])opt+=list[i];
            else if(list[i]==list[i-K]) list[i]=-1;
        }
        System.out.println(opt);
    }
}