import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Ai = sc.nextLine();
        int Answer;
        for(int i=0; i<M; i++){
            N = N - Ai[i];
        }
        if(N < 0){
          System.out.plintln(-1);
        }else{
          System.out.plintln(N);
        }
    }
}