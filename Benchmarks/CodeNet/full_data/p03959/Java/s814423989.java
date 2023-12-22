import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yangyuyin on 16/10/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] tn = new int[N];
        int[] an = new int[N];
        long[] possible = new long[N];
        Arrays.fill(possible,Integer.MAX_VALUE);
        long result=1;
        possible[0]=0;
        possible[N-1]=0;
        for(int i=0;i<N;i++){
            tn[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            an[i]=sc.nextInt();
        }
        for(int i=1;i<N-1;i++){
            if(tn[i]>tn[i-1]) {
                possible[i]=0;
                if(tn[i]>an[i]) result=0;
            }else{
                possible[i]=tn[i];
            }
        }
        for(int i=N-2;i>=1;i--){
            if(possible[i]==0) continue;
            if(an[i]>an[i+1]){
                possible[i]=0;
                if(an[i]>tn[i]) result=0;
            }else {
                possible[i]=possible[i]<=an[i]?possible[i]:an[i];
            }
        }
        for(int i=0;i<N;i++){
            if(possible[i]==0) possible[i]=1;
            result*=possible[i];
        }
        result%=Math.pow(10,9)+7;
        System.out.print(result);
    }
}
