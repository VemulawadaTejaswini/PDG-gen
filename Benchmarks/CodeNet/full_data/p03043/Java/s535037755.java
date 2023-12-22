import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double K = sc.nextInt();
        double tmp = 0.0;
        double kakuritu = 0.0;

        for(int i = 0; i < N; i++){
          for(int j = 0; j < 1000000 ; j++ ){
            if (((i+1) * Math.pow(2.0,j)) >= K){
              tmp = Math.pow(0.5,j) / N;
              break;
            }

          }
          kakuritu += tmp;
          //kakuritu = kakuritu / N;
        }
        System.out.println(kakuritu);
}
}
