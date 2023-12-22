import java.util.*;
 
class Main {
    static int H,W,N;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        W = scan.nextInt();
        N = scan.nextInt();
        int result = 0;
        if(W>H){
            for(int i=1;i<H+1;i++){
                result = W*i;
                if(result>=N){
                    result = i;
                    break;
                }
            }
        }
        else{
            for(int i=1;i<W+1;i++){
                result = H*i;
                if(result>=N){
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}