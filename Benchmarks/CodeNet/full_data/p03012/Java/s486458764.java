import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] W = new int[N];
        int ssum = 0;
        int ssum2 = 0;
        int ssumb = 0;

        for(int i=0; i<N; i++){
            W[i] = sc.nextInt();
            ssum += W[i];
        }
        for(int i=0; i<N; i++){
            if(ssum2>=ssum/2){
                break;
            }
            ssum2 += W[i];
        }
        for(int i=N-1; i>=0; i--){
            if(ssumb>=ssum/2){
                break;
            }
            ssumb += W[i];
        }
        if(ssum2<=ssumb){
            System.out.println(2*ssum2-ssum);
        }
        else if(ssumb<ssum2){
            System.out.println(2*ssumb-ssum);
        }
    }
}