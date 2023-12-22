import java.util.*;

 class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt=0;
        if(K>1) {          	
         cnt = N-K;	
        }
        System.out.println(cnt);
    }
}
