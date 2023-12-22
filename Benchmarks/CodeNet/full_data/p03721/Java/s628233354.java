import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,K;
    int [] list = new int[100000];
    N = sc.nextInt();
    K = sc.nextInt();
    for(int a=0;a<N;a++){
        int ai = sc.nextInt();
        int bi = sc.nextInt();
        list[ai] = + bi;
    }
    int kth_num=0;
    int num = 0;
    for(int a=0;a<100000;a++){
        if(list[a]!=0) {
            num = num + list[a];
            kth_num = a;
        }
        if(num >= K) break;
    }
    System.out.println(kth_num);
}
}