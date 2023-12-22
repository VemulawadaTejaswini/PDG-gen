import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=0; i<M; i++){
          int Ai = sc.next();
          N = N - Ai;
        }
        if(N < 0){
          System.out.println(-1);
        }else{
          System.out.println(N);
        }
    }
}