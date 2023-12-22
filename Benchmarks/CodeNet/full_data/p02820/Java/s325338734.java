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
            if(I.charAt(i)=='r'){
                opt+=P;
                list[i]=P;
            }
            else if(I.charAt(i)=='s'){
                opt+=R;
                list[i]=R;
            }
            else if(I.charAt(i)=='p'){
                opt+=S;
                list[i]=S;
            }
        }
        for(int i=K;i<N;i++){
            if(list[i]==list[i-K]){
                opt-=list[i];
                list[i]=0;
            }
        }
        System.out.println(opt);
    }
}