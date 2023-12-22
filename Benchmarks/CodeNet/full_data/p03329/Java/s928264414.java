import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int k = 9 * 9 * 9 * 9 * 9 * 9;
        int r = 6 * 6 * 6 * 6 * 6 * 6 * 6;
        int a;
        int ans = 0;

        for(int i=0; i<100000; i++){
            a = Math.max(k, r);
            System.out.println(a);
            if(a<=N){
                N -= a;
                ans += 1;
            }
            else if(a>N){
                if(a==k){
                    k /= 9;
                }
                else{
                    r /= 6;
                }
            }
            if(N==0){
                System.out.println(ans);
                break;
            }
            System.out.println("k" + k+" r"+r + " N"+N); 
        }
    }
}